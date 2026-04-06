public class BinaryToDecimal {
    
    public static String convertRecursion(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        return convertRecursion(decimal / 2) + (decimal % 2);
    }

    public static String convertIterative(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }

        return binary.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertRecursion(67));
        System.out.println(convertIterative(67));
    }
}
