package cl.az.test.service.client;

import cl.az.test.helper.Constants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;

public class RestClient {

    public Object get(String endpoint, Class clsResponse)
            throws Exception {
        GetMethod method = null;
        try {
            Gson gson = new GsonBuilder().create();
            HttpClient httpclient = new HttpClient();
            String _endpoint = "http://" + Constants.HOST + ":" + Constants.PORT + endpoint;
            method = new GetMethod(_endpoint);
            int responseCode = httpclient.executeMethod(method);
            //System.out.println("responseCode:" + responseCode);
            if (responseCode >= 200 && responseCode < 300) {
                method.getResponseBody();
                String responseBody = method.getResponseBodyAsString();
                //System.out.println("responseBody:" + responseBody);
                Object response = gson.fromJson(responseBody, clsResponse);
                return response;
            } else {
                System.out.println(
                        "Error al consumir servicio (codigoError :"+responseCode+", endpoint: "+endpoint+", respuesta :" +method.getResponseBodyAsString()
                        );
                throw new Exception("Error al consumir servicio");
            }
        } catch (Exception ex) {
            System.out.println(ex.getClass().getName());
            throw ex;
        } finally {
            if (method != null && method != null) {
                method.releaseConnection();
            }
        }
    }
}
