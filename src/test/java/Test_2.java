import org.apache.http.client.methods.*;
import org.apache.http.impl.client.*;
import org.junit.*;

import java.io.*;

import static org.junit.Assert.*;

public class Test_2 {

    private final String pathToServer = "http://localhost:8081";
    private final CloseableHttpClient httpclient = HttpClients.createDefault();

    @Test
    public void getOwner4InfoPage() throws IOException {
        HttpGet httpGet = new HttpGet(pathToServer +"/owners/4");
        CloseableHttpResponse response = httpclient.execute(httpGet);
        assertEquals(response.getStatusLine().getStatusCode(), 200);
    }


    @Test
    public void getOwner4EditPage() throws IOException {
        HttpGet httpGet = new HttpGet(pathToServer +"/owners/4/edit");
        CloseableHttpResponse response = httpclient.execute(httpGet);
        assertEquals(response.getStatusLine().getStatusCode(), 200);
    }

}
