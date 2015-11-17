package mum.ea.blog.util;

import org.jsoup.Jsoup;

/**
 * 
 * @author Toan Quach
 *
 */
public class BlogUtil {

	private BlogUtil() {
		// prevent instantiate
	}

	/**
	 * 
	 * @param html
	 * @return
	 */
	public static String htmlToText(String html) {
		// parsing HTML code to text
		return Jsoup.parse(html).text();
	}

	/**
	 * 
	 * @param nonHtml
	 * @return
	 */
	public static String trimContent(String html) {
		String nonHtml = htmlToText(html);
		// set short description based on the content
		if (nonHtml.length() > 300) {
			return nonHtml.substring(0, 250);
		}

		return nonHtml;
	}
}
