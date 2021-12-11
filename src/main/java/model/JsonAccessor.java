package model;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class JsonAccessor
{

    public JsonAccessor()
    {

    }


    public String readFromURL(String url) throws IOException {
        URL userSearch = new URL(url);
        URLConnection connection = userSearch.openConnection();
        connection.setRequestProperty("User-Agent",
                "CS222FirstProject/0.1 (zkyoung@bsu)");

        try {
            connection.connect();
        }
        catch (ConnectException | EOFException | UnknownHostException connectionException) {
            System.err.println("Network error :(");
            System.exit(3);
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String inputLine = in.readLine();
        in.close();
        return inputLine;
    }

}
