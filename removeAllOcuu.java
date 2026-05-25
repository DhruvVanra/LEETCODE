
class removeAllOcuu{

    public static String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);

        int index = sb.indexOf(part);

        while(index != -1) {

            sb.delete(index, index + part.length());

            index = sb.indexOf(part);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "axxxxyyyyb";
        String part = "xy";
        System.out.println(removeOccurrences(s, part));
    }
}