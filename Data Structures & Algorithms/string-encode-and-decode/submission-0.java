class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String st : strs) {
            int len = st.length();
            sb.append(len);
            sb.append('#');
            sb.append(st);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != '#') {
                j++;
            }

            int len = Integer.parseInt(str.substring(i, j));

            i = j + 1;

            result.add(str.substring(i, i + len));

            i += len;
        }

        return result;
    }
}
