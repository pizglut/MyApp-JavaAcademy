public class Zliczanie {

    public static void getCharacters(String str) {

        int znaki = 256;
        int count[] = new int[znaki];

        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)]++;

        char zn[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            zn[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                if (str.charAt(i) == zn[j])
                    find++;
            }

            if (find == 1)
                System.out.println(str.charAt(i) + " = " + count[str.charAt(i)]);
        }
    }
}
