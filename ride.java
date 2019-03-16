/*ID: adwait.1
TASK: ride
LANG: JAVA
*/

import java.io.*;

class ride{

    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("ride.in"));//to set input ile
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));// to set output file


        String cometname = f.readLine();
        String groupname = f.readLine();
        f.close();

        int cometnum = 1;
        int groupnum = 1;
        for (int b = 0; b < cometname.length(); b++) {
            cometnum = ((int) cometname.charAt(b) - 64) * cometnum;  // assigning the comet a number
        }
        for (int b = 0; b < groupname.length(); b++) {
            groupnum = ((int) groupname.charAt(b) - 64) * groupnum;  // assigning the group a number
        }
            int out1 = cometnum % 47;
            int out2 = groupnum % 47;

            if (out1 == out2) {
                out.println("GO");
            } else {
                out.println("STAY");
            } //final output block
            out.close();

        }
    }










































































// https://www.ranker.com/list/best-harem-hentai-movies-and-ovas/meme-dude?ref=colle
