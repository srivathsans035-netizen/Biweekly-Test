class MaxProductWords {
    public int maxProduct(String[] words) {
        int maxProduct = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (dontShare(words[i], words[j])) {
                    int currProduct = words[i].length() * words[j].length();
                    maxProduct = Math.max(maxProduct, currProduct);
                }
            }
        }
        return maxProduct;
    }

    private boolean dontShare(String a, String b) {
        boolean[] isPresent = new boolean[26];
        for (int i = 0; i < a.length(); i++) {
            isPresent[a.charAt(i) - 'a'] = true;
        }
        for (int i = 0; i < b.length(); i++) {
            if (isPresent[b.charAt(i) - 'a']) return false;
        }
        return true;
    }
}
