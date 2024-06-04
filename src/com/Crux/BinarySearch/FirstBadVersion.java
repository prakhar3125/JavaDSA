package com.Crux.BinarySearch;

class VersionControl {
    // Mocking the isBadVersion method for testing purposes
    boolean isBadVersion(int version) {
        // Define the first bad version for testing
        int firstBadVersion = 4;
        return version >= firstBadVersion;
    }
}

public class FirstBadVersion {
    public static void main(String[] args) {
        Solution solution = new FirstBadVersion().new Solution();
        int n = 10; // Example number of versions
        System.out.println("First bad version is: " + solution.firstBadVersion(n));
    }

    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int l = 1;
            int h = n;
            int ans = 0;
            while (l <= h) {
                int mid = l + (h - l) / 2;
                if (isBadVersion(mid)) {
                    ans = mid;
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            return ans;
        }
    }
}
