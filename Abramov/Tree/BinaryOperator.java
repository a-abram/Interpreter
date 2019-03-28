package Abramov.Tree;

import Abramov.Token;

public class BinaryOperator extends Node {
    public Node left, right;

    public BinaryOperator(Node left, Token token, Node right) {
        super(token);
        this.left = left;
        this.right = right;
    }
}