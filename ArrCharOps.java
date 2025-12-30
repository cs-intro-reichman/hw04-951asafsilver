public class ArrCharOps {
    public static void main(String[] args) {
        String str = "clearly";
        char[] arr1 = {'c','l','e','a','r','l','y'};
        char[] arr2 = {'U','n','d','e','r','s','t', 'o', 'o', 'd'};
        
        System.out.println(str);
        println(arr1);
        
        System.out.println(charAt(arr1,2));
        System.out.println(indexOf(arr1,'l'));
        System.out.println(indexOf(arr1,'l',3));
        System.out.println(lastIndexOf(arr1, 'l'));
        
        char[] concatedArr = concat(arr1, arr2);
        println(concatedArr);
        
        char[] subArr = subArray(arr2, 2, 9);
        println(subArr);
        
        System.out.println(compareTo("abcd", "abcd"));
        System.out.println(compareTo("abc", "abcd"));
        System.out.println(compareTo("abw", "abcd"));
        System.out.println(compareTo("Abcd", "a"));
        System.out.println(compareTo("apple", "banana"));
        System.out.println(compareTo("apple", "applepie"));
        System.out.println(compareTo("Zoo", "zoo"));
        
        System.out.println(hashCode(arr1));
        System.out.println(hashCode(arr2));
    }

    public static void println(char[] arr) {
        if (arr == null) {
            System.out.println("null");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static char charAt(char[] arr, int index) {
        return arr[index];
    }

    public static boolean equals(char[] arr1, char[] arr2) {
        if (arr1 == null && arr2 == null) return true;
        if (arr1 == null || arr2 == null) return false;
        if (arr1.length != arr2.length) return false;
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static int indexOf(char[] arr, char ch) {
        if (arr == null) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) return i;
        }
        return -1;
    }

    public static int indexOf(char[] arr, char ch, int fromIndex) {
        if (arr == null) return -1;
        for (int i = fromIndex; i < arr.length; i++) {
            if (arr[i] == ch) return i;
        }
        return -1;
    }

    public static int lastIndexOf(char[] arr, char ch) {
        if (arr == null) return -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == ch) return i;
        }
        return -1;
    }

    public static char[] concat(char[] arr1, char[] arr2) {
        int len1 = (arr1 == null) ? 0 : arr1.length;
        int len2 = (arr2 == null) ? 0 : arr2.length;
        char[] newArr = new char[len1 + len2];
        
        for (int i = 0; i < len1; i++) {
            newArr[i] = arr1[i];
        }
        for (int i = 0; i < len2; i++) {
            newArr[len1 + i] = arr2[i];
        }
        return newArr;
    }

    public static char[] subArray(char[] arr, int beginIndex, int endIndex) {
        if (arr == null) return null;
        char[] newArr = new char[endIndex - beginIndex];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[beginIndex + i];
        }
        return newArr;
    }

    public static long hashCode(char[] arr) {
        if (arr == null || arr.length == 0) return 0;
        long hash = 0;
        long powerOf7 = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            hash += (long) arr[i] * powerOf7;
            powerOf7 *= 7;
        }
        return hash;
    }

    public static int compareTo(String str1, String str2) {
        if (str1 == null || str2 == null) return -2;
        int len1 = str1.length();
        int len2 = str2.length();
        int minLen = Math.min(len1, len2);

        for (int i = 0; i < minLen; i++) {
            if (str1.charAt(i) < str2.charAt(i)) return -1;
            if (str1.charAt(i) > str2.charAt(i)) return 1;
        }

        if (len1 < len2) return -1;
        if (len1 > len2) return 1;
        return 0;
    }
}