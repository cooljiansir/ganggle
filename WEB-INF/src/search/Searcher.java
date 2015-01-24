package search;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.queryparser.classic.MultiFieldQueryParser;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.search.highlight.Formatter;
import org.apache.lucene.search.highlight.Fragmenter;
import org.apache.lucene.search.highlight.Highlighter;
import org.apache.lucene.search.highlight.InvalidTokenOffsetsException;
import org.apache.lucene.search.highlight.QueryScorer;
import org.apache.lucene.search.highlight.SimpleHTMLFormatter;
import org.apache.lucene.search.highlight.SimpleSpanFragmenter;
import org.apache.lucene.store.FSDirectory;

import org.apache.commons.lang.StringEscapeUtils;

public class Searcher {
	private String indexPath = "index.data";
	private int total;
	
	public int getTotal() {
		return total;
	}
	public ArrayList<Qdata> getQueryResult(
			String wd,int offset,int limit,int titleLen,int contentLen) 
			throws IOException, ParseException{
		ArrayList<Qdata> reslist = new ArrayList<Qdata>();
        IndexReader reader = DirectoryReader.open(FSDirectory.open(new File(indexPath)));  
        IndexSearcher searcher = new IndexSearcher(reader);  
        Analyzer analyzer = new StandardAnalyzer();  
        
        MultiFieldQueryParser queryParser = new MultiFieldQueryParser(
                new String[] {"title","content","href"},
                analyzer);
        
		Query query= queryParser.parse(wd);
        TopDocs tds=searcher.search(query, limit+offset);
        ScoreDoc[] sds= tds.scoreDocs;
        System.out.println(tds.totalHits+" total.");
        
        this.total = tds.totalHits;
        
        for (int i = offset;i<tds.totalHits;i++) {
        	if(i>offset+limit-1)
        		break;
            Document document=searcher.doc(sds[i].doc);
            Qdata data = new Qdata();
            
            data.setHref(document.get("href"));
            String title = document.get("title");
            String content = document.get("content");
            data.setDate("2014-9-9");
            
            try {
				if(title.length()>titleLen)
					data.setTitle(title.substring(0,titleLen));
				else data.setTitle(title);
				data.setContent(this.highLight(analyzer, query,wd,content,contentLen));
			} catch (InvalidTokenOffsetsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            
            //document.get("date")
            //System.out.println("href "+data.getHref());
            //System.out.println("title "+data.getTitle());
            //System.out.println("content "+data.getContent());
            reslist.add(data);
        }
    	reader.close();
    	return reslist;
	}
	public String highLight(Analyzer analyzer,Query query,String fieldName,String text,int fragLen) throws IOException, InvalidTokenOffsetsException{
		QueryScorer queryScorer = new QueryScorer(query);
		Fragmenter fragmenter = new SimpleSpanFragmenter(queryScorer,fragLen);
//		Formatter formatter = new SimpleHTMLFormatter("<em>","</em>");
		//do nothing change
		Formatter formatter = new SimpleHTMLFormatter("","");
		Highlighter highlighter = new Highlighter(formatter,queryScorer);
		highlighter.setTextFragmenter(fragmenter);
		String str = highlighter.getBestFragment(analyzer, fieldName, text);
		//String escStr = StringEscapeUtils.escapeHtml(str);
		//return escStr.replace(fieldName,"<em>"+fieldName+"</em>");
		if(str==null)
			return null;
		return str.replace("&","&#38;").
				replace("<", "&#60;").
				replace(">","&#62;").
				replace(fieldName,"<em>"+fieldName+"</em>");
	}
}
