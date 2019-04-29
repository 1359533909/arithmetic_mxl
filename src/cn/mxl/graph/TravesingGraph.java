package cn.mxl.graph;

import java.util.LinkedList;

public class TravesingGraph {
	private int vertexSize;//顶点数量
	private int[] vertexs; //顶点数组
	private int[][] matrix;
	private boolean [] isVisited;
	private final static int MAX_WEIGHT=1000;
	public TravesingGraph(int vertexSize) {
		this.vertexSize=vertexSize;
		matrix=new int[vertexSize][vertexSize];
		isVisited=new boolean[vertexSize];
	}
	/**
	 * 出度
	 *
	 */
	public int getOutDegree(int index) {
		int weight=0;
		int degree=0;
		for(int j=0;j<matrix[index].length;j++) {
			weight=matrix[index][j];
			if(weight!=0&&weight!=MAX_WEIGHT) {
				degree++;
			}
		} 
		return degree;
	}
	/**
	 * 入度
	 *
	 */
	public int getInputDegree(int index) {
		int weight=0;
		int degree=0;
		for(int i=0;i<matrix.length;i++) {
			weight=matrix[i][index];
			if(weight!=0&&weight!=MAX_WEIGHT) {
				degree++;
			}
		}
		return degree;
	}
	/**
	 * 
	 * 获得第一个邻接点
	 */
	public int getFirstNeighBor(int index) {
		for(int j=0;j<vertexSize;j++) {
			if(matrix[index][j]>0&&matrix[index][j]<MAX_WEIGHT) {
				return j;
			}
		}
		return -1;
	}
	/**
	 *根据前一个邻接点的下标取得下一个邻接点 
	 *v表示要找的顶点
	 *index表示该顶点相对于哪个邻接点获取下一个邻接点
	 */
	public int getNextNeighbor(int v,int index) {
		for(int j=index+1;j<vertexSize;j++) {
			if(matrix[v][j]>0&&matrix[v][j]<MAX_WEIGHT) {
				return j;
			}
		}
		return -1;
	}
	/**
	 * 图的深度优先遍历
	 */
	private void depthFirstSearch(int i) {
		isVisited[i]=true;
		int w = getFirstNeighBor(i);
		while(w!=-1) {
			if(!isVisited[w]) {
//				需要遍历该结点
				System.out.println("访问到了:"+w+"顶点");
				depthFirstSearch(w);
			}
			w=getNextNeighbor(i, w);
		}
	}
	
	/**
	 * 对外公开的深度优先遍历
	 */
	public void depthFirstSearch() {
		isVisited = new boolean[vertexSize];
		for(int i=0;i<vertexSize;i++) {
			if(!isVisited[i]) {
				System.out.println("访问到了:"+i+"顶点");
				depthFirstSearch(i);
			}
		}
		isVisited=new boolean[vertexSize];
	}
	
	/**
	 * 广度优先遍历
	 */
	public void broadFirstSearch() {
		isVisited=new boolean[vertexSize];
		for(int i=0;i<vertexSize;i++) {
			if(!isVisited[i]) {
				broadFirstSearch(i);
			}
		}
	}
	/**
	 * 对外的广度优先遍历
	 */
	public void broadFirstSearch(int i) {
		int u,w;
		LinkedList<Integer> queue=new LinkedList<Integer>();
		System.out.println("访问到:"+i+"顶点");
		isVisited[i]=true;
		queue.add(i);//第一次把v0加到队列
		while(!queue.isEmpty()) {
			u=queue.removeFirst().intValue();
			w=getFirstNeighBor(u);
			while(w!=-1) {
				if(!isVisited[w]) {
					System.out.println("访问到了:"+w+"顶点");
					isVisited[w]=true;
					queue.add(w);
				}
				w=getNextNeighbor(u, w);
			}
		}
	}
	
	public int getWeight(int v1,int v2) {
		return matrix[v1][v2]==0?0:(matrix[v1][v2]==MAX_WEIGHT?-1:matrix[v1][v2]);
	}
	public int getVertexSize() {
		return vertexSize;
	}
	public void setVertexSize(int vertexSize) {
		this.vertexSize = vertexSize;
	}
	public int[] getVertexs() {
		return vertexs;
	}
	public void setVertexs(int[] vertexs) {
		this.vertexs = vertexs;
	}
	public int getMAX_WEIGHT() {
		return MAX_WEIGHT;
	}
	public static void main(String[] args) {
		TravesingGraph graph=new TravesingGraph(9);
		int[] a1=new int[] {0,10,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,11,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT};
		int[] a2=new int[] {10,0,18,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,16,MAX_WEIGHT,12};
		int[] a3=new int[] {MAX_WEIGHT,MAX_WEIGHT,0,22,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT};
		int[] a4=new int[] {MAX_WEIGHT,MAX_WEIGHT,22,0,20,MAX_WEIGHT,MAX_WEIGHT,16,21};
		int[] a5=new int[] {MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,20,0,26,MAX_WEIGHT,7,MAX_WEIGHT};
		int[] a6=new int[] {11,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,26,0,17,MAX_WEIGHT,MAX_WEIGHT};
		int[] a7=new int[] {MAX_WEIGHT,16,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,17,0,19,MAX_WEIGHT};
		int[] a8=new int[] {MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,16,7,MAX_WEIGHT,19,0,MAX_WEIGHT};
		int[] a9=new int[] {MAX_WEIGHT,12,8,21,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,0};
		graph.matrix[0]=a1;
		graph.matrix[1]=a2;
		graph.matrix[2]=a3;
		graph.matrix[3]=a4;
		graph.matrix[4]=a5;
		graph.matrix[5]=a6;
		graph.matrix[6]=a7;
		graph.matrix[7]=a8;
		graph.matrix[8]=a9;
		graph.depthFirstSearch();
		graph.broadFirstSearch();
	}
}
