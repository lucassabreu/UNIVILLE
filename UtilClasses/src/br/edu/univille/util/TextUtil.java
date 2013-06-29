package br.edu.univille.util;

/**
 * Text Uti class, static methods for string work.
 * 
 * @author Lucas dos Santos Abreu <lucas.s.abreu@gmail.com>
 */
public class TextUtil {

    /**
     * Fill a empty string with spaces to complete lenght
     * 
     * @param content
     *            Content to fill
     * @param lenght
     *            Lenght must have
     * @return Filled string
     */
    public static String fillSpacesRight(String content, int lenght) {

        StringBuilder sb = new StringBuilder();

        if (content.length() < lenght) {
            sb.append(content);

            for (int i = sb.length(); i < lenght; i++)
                sb.append(" ");
        } else
            sb.append(content.substring(0, lenght));

        return sb.toString();
    }
}
