//The node class
public class Node{
  //declare node attributes
  private String name;
  private Int node_distance= INTEGER.MAX;
  private Map<Node,Integer> neighbour_nodes= new HashMap<>();
  private List<Node> node_shortest_path= new LinkedList<>();
  
  //add neighbouring nodes function
  public void add_neighbouring_nodes(Node neightbour, int distance){
    neighbour_nodes.add(neighbour,distance);
  }
  
  public Node(String name, int distance){
  this.node_distance=distance;
  this.name=name;
  }
  
  public int getDistance(){
  return node_distance;
  }
  public String getName(){
  return name;
  }
  public void setDistance(int distance){
  this.node_distance=distance;
  }
  public String setName(String name){
  this.name=name;
  }


  
}
//The graph class
public class Graph {
  
  private Set<Node> graph_nodes= new HashSet<>();
  
  //Method to add a node to graph_nodes
  public void add_node_to_graph(Node node){
    graph_nodes.add(node);
  }

}

//Method to calculate node with the lowest distance from source node
private static Node calculateLowestDistance(Set<Node> RemainingNodes){
  
  Node result_node;
  int result_node_distance= INTEGER.MAX_VALUE;
  
  for(Node current_node: RemainingNodes){
    if(result_node_distance > current_node.getDistance() ){
      result_node_distance=current_node.getDistance();
      result_node= current_node;
    }
  }
  return result_node;
}

//Method to return the lowest actual distance with new node
private static void returnActualLowestDistance(Node source,
                                               int edge_valueNode,
                                               Node check_node){
  
  int source_node_distance= source.getDistance() + edge_value;
  
  if( check_node.getDistance() > source_node_distance ){
    
    check_node.setDistance(source_node_distance );
    LinkedList<Node> check_node_shortest_paths= new LinkedList<>(source_node.getShortestPath());
    check_node_shortest_paths.add(source);
    check_node.setShortestPath(check_node_shortest_paths);
  }
  
}

//method to implement dijkstra algorithm using above written functions
public static Graph implementDikstraAlgorithm(Graph graph_nodes, Node source_node){
  
  //set source distance to 0
  source_node.setDistance(0);
  
  //create two sets of checked and remaining nodes
  Set<Node> checked_nodes= new HashSet<>();
  Set<Node> remaining_nodes= new HashSet<>();
  remaining_nodes.add(source_node);
  
  //traverse until the remaining_nodes is empty
  while(remaining_nodes.size()!=0){
    //get lowest distance from remaining_nodes from source_node
    Node lowest_distance_node = calculateLowestDistance(remaining_node);
    
    for(
      Entry<Node,Integer> neighbour_pair: lowest_distance_node.getNeighbourNodes().entrySet()
    ){
      Node neighbour_node= neighbour_pair.getKey();
      Integer edge_value= neighbour_pair.getValue();
      
      if(!checked_nodes.contains(neighbour_node)){
        returnActualLowestDistance(lowest_distance_node, edge_value, neighbour_node);
        remaining_nodes.add(neighbour_node);
      }
      
    }
    checked_nodes.add(lowest_distance_node);
  }
 return graph_nodes;
}


