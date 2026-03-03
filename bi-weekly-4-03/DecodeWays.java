class DecodeWays {
    public int numDecodings(String s) {
        if (s == null || s.isEmpty() || s.charAt(0) == '0') {
            return 0;
        }

        int n = s.length();
        int[] ways = new int[n + 1];
        ways[0] = 1;
        ways[1] = 1;

        for (int i = 2; i <= n; i++) {
            int last = s.charAt(i - 1) - '0';
            int pair = (s.charAt(i - 2) - '0') * 10 + last;

            if (last != 0) {
                ways[i] += ways[i - 1];
            }

            if (pair >= 10 && pair <= 26) {
                ways[i] += ways[i - 2];
            }
        }

        return ways[n];
    }
}
