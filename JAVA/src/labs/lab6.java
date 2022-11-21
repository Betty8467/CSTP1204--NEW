package labs;

class lab6 {
        public int main(String s) {

            int l = s.length();

            int [] lettercount = new int[26];

            for(int i = 0; i < l; i ++) {
                lettercount[s.charAt(i) - 'a']++;
            }

            for(int i = 0; i < l; i ++) {
                if (lettercount[s.charAt(i) - 'a'] == 1)
                    return i;
            }

            return -1;

        }
}
