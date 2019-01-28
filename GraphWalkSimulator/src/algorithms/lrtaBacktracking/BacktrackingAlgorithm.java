package algorithms.lrtaBacktracking;

import yaps.graph.Graph;
import yaps.simulator.core.AgentPosition;
import yaps.simulator.multiagent.SimpleAgent;
import yaps.simulator.multiagent.SimpleMultiagentAlgorithm;


public class BacktrackingAlgorithm extends SimpleMultiagentAlgorithm {
	
	private int[] sharedMemory;  // mapeamento  "id do vertice" (usado como indice) -> "valor do vértice"
	SimpleAgent[] agents;
	private int meta = 15;
	public BacktrackingAlgorithm(){
		super("Node Count");
	}
	
	@Override
	public void onSimulationEnd() {
	 
		//does nothing
	}

	@Override
	public SimpleAgent[] createTeam(AgentPosition[] positions, Graph g, int time) {
		int numAgents = positions.length;
		
		sharedMemory = new int[g.getNumNodes()]; //starts all zero
		
		  agents = new SimpleAgent[numAgents];
		for (int i = 0; i < numAgents; i++) {
			agents[i] = new bacnTrackingAgent(g, sharedMemory,meta );
		}
		return agents;
	}

}