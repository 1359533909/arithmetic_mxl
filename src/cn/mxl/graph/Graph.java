package cn.mxl.graph;

public class Graph {
	private int vertexSize;//顶点数量
	private int[] vertexs; //顶点数组
	private int[][] matrix;
	private final static int MAX_WEIGHT=1000;
	public Graph(int vertexSize) {
		this.vertexSize=vertexSize;
		matrix=new int[vertexSize][vertexSize];
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
	 * @return
	 */
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
		Graph graph=new Graph(5);
		int[] a1=new int[] {0,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,6};
		int[] a2=new int[] {9,0,3,MAX_WEIGHT,MAX_WEIGHT};
		int[] a3=new int[] {2,MAX_WEIGHT,0,5,MAX_WEIGHT};
		int[] a4=new int[] {MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,0,1};
		int[] a5=new int[] {MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,MAX_WEIGHT,0};
		graph.matrix[0]=a1;
		graph.matrix[1]=a2;
		graph.matrix[2]=a3;
		graph.matrix[3]=a4;
		graph.matrix[4]=a5;
		int outDegree = graph.getOutDegree(1);
		System.out.println(outDegree);
		int inputDegree = graph.getInputDegree(1);
		System.out.println(inputDegree);
	}
}
