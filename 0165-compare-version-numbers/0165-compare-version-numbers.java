class Solution {
    public int compareVersion(String v1, String v2) {
        String a[] = v1.split("\\.");
        String b[] = v2.split("\\.");

        if (a.length > b.length) {
            int[] arr1 = new int[a.length];
            int[] arr2 = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                arr1[i] = Integer.parseInt(a[i]);
                arr2[i] = (i < b.length) ? Integer.parseInt(b[i]) : 0; 
                if (arr1[i] > arr2[i]) return 1;
                if (arr1[i] < arr2[i]) return -1;
            }
        } else {
            int[] arr1 = new int[b.length];
            int[] arr2 = new int[b.length];
            for (int i = 0; i < b.length; i++) {
                arr1[i] = (i < a.length) ? Integer.parseInt(a[i]) : 0; 
                arr2[i] = Integer.parseInt(b[i]);
                if (arr1[i] > arr2[i]) return 1;
                if (arr1[i] < arr2[i]) return -1;
            }
        }

        return 0;
    }
}
