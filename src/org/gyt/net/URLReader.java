package org.gyt.net;

import java.net.*;
import java.io.*;

public class URLReader {
	public static void main(String[] args) throws Exception {

		// URL google = new
		// URL("http://107.109.44.215/scim_final/view_report_summary.php");
		// URL google = new
		// URL("http://107.109.44.215/scim_final/view_report_backend.php");
		URL google = new URL("http://www.google.com");

		BufferedReader in = new BufferedReader(new InputStreamReader(google.openStream()));

		String inputLine;
		while ((inputLine = in.readLine()) != null)
			System.out.println(inputLine);
		in.close();
	}
}