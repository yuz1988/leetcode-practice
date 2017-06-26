package set2;

class TrieNode {
    // Initialize your data structure here.
    
    // Each node has 26 pointers a-z
    TrieNode[] children;
    // Whether this node is the end of a word (otherwise, it is just a prefix)
    boolean flag;
    
    public TrieNode() {
        children = new TrieNode[26];
        flag = false;
    }
}

public class Solution208 {
    private TrieNode root;

    public Solution208() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode node = root;
        for (int i=0; i<word.length(); i++) {
            int index = word.charAt(i)-'a';
            if (node.children[index]==null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.flag = true;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode node = root;
        for (int i=0; i<word.length(); i++) {
            int index = word.charAt(i)-'a';
            TrieNode child = node.children[index];
            if (child==null) {
                return false;
            }
            node = child;
        }
        
        // judge if the last char's node is the end char of a word (important!)
        return node.flag;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        if (prefix.length()==0) {
            return false;
        }
        
        TrieNode node = root;
        // reach to the node of last char of the prefix
        for (int i=0; i<prefix.length(); i++) {
            int index = prefix.charAt(i)-'a';
            TrieNode child = node.children[index];
            if (child==null) {
                return false;
            }
            node = child;
        }
        return true;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");