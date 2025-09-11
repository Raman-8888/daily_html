import java.util.*;

class Solution {
    public String sortVowels(String s) {
        String res = "";
        String sorted = "";

        char arr[] = s.toCharArray();

        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 65 || arr[i] == 69 || arr[i] == 73 || arr[i] == 79 || arr[i] ==85 ||
                arr[i] == 97 || arr[i] == 101 || arr[i] == 105 || arr[i] == 111 ||
                 arr[i]==117) {
                sorted += arr[i];
            }
        }

        
        char arr2[] = sorted.toCharArray();
        Arrays.sort(arr2);

        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 65 || arr[i] == 69 || arr[i] == 73 || arr[i] == 79 || arr[i] ==85 ||
                arr[i] == 97 || arr[i] == 101 || arr[i] == 105 || arr[i] == 111 || 
                arr[i] == 117) {
                arr[i] = arr2[idx++];
            }
        }

        
        res = new String(arr);
        return res;
    }
}
