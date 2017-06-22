// where should this go? same folder as ServerMain? as methods in Snapshotter or ServerMain?

import codeu.chat.server.Model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationEx {

	public void deserialize() {
		try {
			FileInputStream fs = new FileInputStream("StoredData.txt");
			ObjectInputStream os = new ObjectInputStream(fs);

			// saving the objects that are serialized
			// Is there only one object (the data) that needs to be serialized?
			Object one = os.readObject();

			// Cast the object back to Model
			Model data = (Model) one;
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

	public void flag() {
		if (_____) { // if there is a StoredData.txt
			deserialize();
		} else {
			// proceed without deserializing any data
		}
	}
	
}