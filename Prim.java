package sid;
import java.util.Arrays;
public class Prim {
public void Pgraph(int G[][],int V) {
int INF=999;
int no_edge;
boolean[] selected=new boolean[V];
Arrays.fill(selected, false);
no_edge=0;
selected[0]=true;
System.out.println("Edge:Weight");
while (no_edge<V-1) {
int min=INF;
int x=0;
int y=0;
for (int i=0; i<V; i++) {
if (selected[i]==true) {
for (int j=0; j<V; j++)
if(! selected[j] && G[i][j]!=0) {
if (min>G[i][j]) {
min = G[i][j];
x=i;
y=j;
}
}
}
}
System.out.println(x+"-"+y+":"+ G[x][y]);
selected[y]=true;
no_edge++;
}
}
public static void main(String[] args) {
Prim g= new Prim();
int V=5;
int[][] G= {{0,9,70,0,0},
{9,0,90,20,40},
{70,90,0,50,60},
{0,20,50,0,30},
{0,40,60,30,0}
};
g.Pgraph(G, V);
}}