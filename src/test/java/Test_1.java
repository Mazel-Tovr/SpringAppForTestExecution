import org.apache.http.client.methods.*;
import org.apache.http.impl.client.*;
import org.junit.*;

import java.io.*;

public class Test_1 {

    private final String pathToServer = "http://localhost:8081";
    private final CloseableHttpClient httpclient = HttpClients.createDefault();

    @Test
    public void homePage() throws IOException {
        HttpGet httpGet = new HttpGet(pathToServer +"/");
        CloseableHttpResponse response = httpclient.execute(httpGet);
        Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
    }


    @Test
    public void getVets() throws IOException {
        HttpGet httpGet = new HttpGet(pathToServer +"/vets");
        CloseableHttpResponse response = httpclient.execute(httpGet);
        Assert.assertEquals(response.getStatusLine().getStatusCode(), 200);
    }
}
