package Graphs;

public class Graph {
	private final int vertices;
	private int[][] adjacencyMatrix;

	public Graph(int vertices) {
		this.vertices = vertices;
		adjacencyMatrix = new int[vertices][vertices];
	}

	public void addEdge(int source, int destination) {
		adjacencyMatrix[source][destination] = 1;
	}

	public void printGraph() {
		System.out.println("Graph represented using adjacent matrix:");
		for (int i = 0; i < vertices; i++) {
			for (int j = 0; j < vertices; j++) {
				System.out.print(adjacencyMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}

class Stack {
	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	Node top;

	public boolean isEmpty() {
		return top == null;
	}

	public void push(int data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
	}

	public void printStack() {
		Node current = top;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty.");
			return -1;
		}
		int data = top.data;
		top = top.next;
		return data;
	}

	
}
