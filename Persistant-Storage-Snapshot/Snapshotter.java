// add package here
// Where should this file and StoredData be saved?
//  In the same folder as Model.java?

import codeu.chat.server.Model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// should I edit ServerMain for the optional flag part?
//  edited with an if statement checking if StoredData.txt is empty?

public class Snapshotter implements Runnable { 
    // how should I go about creating and serializing Model.java

    public void run() {
        sleep();
        serialize();

    }

    public void serialize() {
        // on what condition should I keep going? while the server is running? how would I say that
        while(_____) {

            // why does this need to be put in a try statement?
            // shouldn't it create a file if it cant find StoredData.txt

            try {
            // StoredData.txt is a file to save the serialized data to
            FileOutputStream fs = new FileOutputStream("StoredData.txt");

            ObjectOutputStream os = new ObjectOutputStream(fs);

            // should I be serializing a Model instance I create?
            os.writeObject(_____); 
            
            // close the streams
            os.close();
            fs.close();

            } catch (IOException i) {
                i.printStackTrace();
            }
        }
    }

    public void sleep() {
        try {
            // makes thread sleep for 30 seconds - therefore it updates the data every 30 seconds
            Thread.sleep(30000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
    // where should the deserialization occur? 
    // when it checks for the optional flag in ServerMain?
}