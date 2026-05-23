//index is the v number
//number of vertices of graphs 
#include <iostream>
#include <vector>
using namespace std;
class Graphs
{
int vertices; 
vector<vector<int>>adjList;
int direction;
int weighted;

   public:
    Graphs(int vertices){
      this->vertices=vertices;
      adjList.resize(vertices);
    }

void display_adjList(){
  cout<<"\nDisplaying the adjList---";
  int index= 0;
  for(auto nbr : adjList)
   {
    cout<<endl<<"Vectex= "<<index<<" No of neighbours= "<<nbr.size()<<"";
      for(auto vertex :nbr)
        cout<<vertex<<" ";
         index++;
      }
   }
   void create_edge(vector<int>&edge)
   {
    int src =edge[0];
    int dest=edge[1];
    int weight =0;

      if(weight == true)
         weight =edge[2];

     adjList[src].push_back(dest);
   }

   if(direction == false)
     adjList[dest]

};

void create_edge_list( vector<vector<int>>&edgeList)
{
edge={0,1,5};
  edgeList.push_back(edge);
  
  edge={1,2,6};
  edgeList.push_back(edge);
  
  edge={3,0,51};
  edgeList.push_back(edge);
  
  edge={3,1,15};
  edgeList.push_back(edge);
}

void display_edgelist( vector<vector<int>>&edgeList){
    cout<<"\n EdgeList: --";
    for(auto edge : edgeList)
    {
        cout<<endl << edge[0]<<" "<<edge[1]<<" "<<edge[2];
    }
}

int main(){
  vector<vector<int>>edgeList;  //information of all edges
  create_edge_list(edgeList);
  display_edgelist(edgeList);

  int vertices= 4; 
  int direction=1;
  int weighted=0;
  // Graphs Graphs(vertices, direction, weighted);
    Graphs Graph;
     Graph.display_adjList();
      for(auto edge : edgeList)
        Graph.create_edge(edge);
  
}