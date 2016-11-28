/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bdb.Logic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;



/**
 *
 * @author sergiodiazpinilla
 */
public class PubMedClient {

    private final String USER_AGENT = "Mozilla/5.0";
    private final String url = "https://eutils.ncbi.nlm.nih.gov/entrez/eutils/";

    private void getArticles(String term) throws Exception {
        String querry = "esearch.fcgi?db=pubmed&term="+term+"&retmode=JSON";
        

        URL obj = new URL(url+querry);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url+querry);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result

        System.out.println(response.toString());
        getMetadata("27732918");

    }
    
    public void getMetadata(String pubmedId) throws Exception{
        String querry = "esummary.fcgi?db=pubmed&id="+pubmedId+"&retmode=JSON";
        

        URL obj = new URL(url+querry);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url+querry);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        //System.out.println(response.toString());
        JSONObject jsonObj = new JSONObject(response.toString());
        System.out.println(jsonObj.toString());
        System.out.println(jsonObj.get("result"));
        getAbstract(pubmedId);
    }
    
    public void getAbstract(String pubmedId) throws Exception{
        String querry = "efetch.fcgi?db=pubmed&id="+pubmedId+"&retmode=JSON&rettype=abstract";
        

        URL obj = new URL(url+querry);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url+querry);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        
        //print result
        System.out.println(response.toString());
        
    }
    
    public static void main(String[] args) {
        try {
            PubMedClient pms = new PubMedClient();
            pms.getArticles("eye");
            //pms.getMetadata("27732918");
        } catch (Exception ex) {
            Logger.getLogger(PubMedClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
