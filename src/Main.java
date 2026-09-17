public class Main {

    public static void main(String[] args) {

        // String[] names = new String[15]
        // names[0] = "act";
        // names[1] = "art";

        String[] name_val = {"act", "art", "ban", "bat", "bar", "cat", "cot", "hat", "mat", "pet",
                "sat", "set", "tic", "tac","toe"};

        String search_key = "toe";
        System.out.println("Found at index: " + index);

        int index = binSearch(search_key, name_val, 0, 14);

        public static int binSearch(String searchVal, String[] arr, int low, int high) {
            }
            int mid = (low+high)/2;
            if(high < low)
                return -1;

            int comp = searchVal.compareTo(arr[mid]);

            // arr[mid] == search_key
            // CompareTo gives 1 of 3 values = 0, 1, -1

            if(comp == 0)
                return mid;
            else if (comp < 0)
                return binSearch(searchVal, arr, low,
                        mid-1);
            else
                return binSearch(searchVal, arr, mid+1, high);
        }
    }
