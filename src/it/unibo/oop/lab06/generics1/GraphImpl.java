package it.unibo.oop.lab06.generics1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GraphImpl implements Graph<String> {

	private Set<String> nodes;
	private Map<String, String> edges;
	
	public GraphImpl(String elem) {
		this.nodes = new HashSet<>();
		this.edges = new HashMap<>();
		}

	@Override
	public void addNode(String node) {
		nodes.add(node);
		
	}

	@Override
	public void addEdge(String source, String target) {
		edges.put(source, target);
		
	}

	@Override
	public Set<String> nodeSet() {
		return this.nodes;
	}

	@Override
	public Set<String> linkedNodes(String node) {
		Set<String> linkedNodes = new HashSet<>();
		for (String n: edges.values()) {
			if (edges.get(node) == n) {
				linkedNodes.add(n);
			}
		}
		return linkedNodes;
	}

	@Override
	public List<String> getPath(String source, String target) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
