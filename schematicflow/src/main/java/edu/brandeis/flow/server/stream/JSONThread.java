/**
 * 
 */
package edu.brandeis.flow.server.stream;

import java.io.IOException;
import java.net.MalformedURLException;

import org.json.JSONException;
import org.json.JSONObject;

import edu.brandeis.flow.core.operator.JSONOperator;
import edu.brandeis.flow.core.operator.in.In;
import edu.brandeis.flow.core.operator.in.twitter.TwitterIN;

/**
 * @author Yahui
 *
 */
public final class JSONThread extends Thread {

	JSONOperator op;

	/**
	 * 
	 */
	public JSONThread(JSONOperator op) {
		this.op = op;
	}

	@Override
	public void run() {
		JSONStream inStream = null;
		try {
			inStream = new JSONStream("localhost", 5050);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		while (true) {
			// read
			JSONObject json = null;
			try {
				if ((json = inStream.read()) != null)
					op.receive(json);
			} catch (JSONException | IOException e) {
				e.printStackTrace();
			}

		}

	}
	//
	// public static void main(String[] args) throws JSONException, IOException
	// {
	// JSONThread t = new JSONThread(new In());
	// t.start();
	// }
}
