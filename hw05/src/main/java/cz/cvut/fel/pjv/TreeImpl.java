/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cz.cvut.fel.pjv;

/**
 *
 * @author Nela
 */
public class TreeImpl implements Tree {
    
    Node root;
    int[] values;

    @Override
    public void setTree(int[] values) {
        this.values = values;
        int end = values.length;
        root = addNode(0, end);
    }
    
    public Node addNode(int start, int end) {
        if (start >= end) {
            return null;
        }
        int middle = (start+end)/2;
        NodeImpl node = new NodeImpl();
        node.setValue(this.values[middle]);
        node.setLeft(addNode(start, middle));
        node.setRight(addNode(middle+1, end));
        return node;
    }
    
    @Override
    public Node getRoot() {
        return root;
    }
    
    public String toString() {
        
        return printout(root, 0);
    }
    
    public String printout(Node node, int depth) {
        if (node == null) { 
            return "";
        }
        String text = "";
        for (int i = 0; i < depth; i++) {
            text += " ";
        }
        text += "- " + node.getValue() + "\n";
        if (node.getLeft() != null) {
            text += printout(node.getLeft(), depth+1);
           }
        if (node.getRight() != null) {
            text += printout(node.getRight(), depth+1);
        }
        return text;
    }
    
    
}