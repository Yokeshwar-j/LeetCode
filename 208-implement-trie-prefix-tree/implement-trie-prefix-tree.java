class Node{
    Node[] child;
    boolean end;
    Node(){
        child = new Node[26];
        end=false;
    }
}
class Trie {
    Node root;
    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        Node cur = root;
        for(char x : word.toCharArray()){
            int id = x-'a';
            if(cur.child[id]==null)cur.child[id] = new Node();
            cur=cur.child[id];
        }
        cur.end=true;
    }
    public Node pre(String word){
        Node cur = root;
        for(char x : word.toCharArray()){
            int id = x-'a';
            if(cur.child[id]==null)return null;
            cur=cur.child[id];
        }
        return cur;
    }
    
    public boolean search(String word) {
        Node temp = pre(word);
        return temp!=null && temp.end==true;
    }
    
    public boolean startsWith(String word) {
        Node temp = pre(word);
        return temp!=null ;//&& temp.end=true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */