package Client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import Legacy.AComercialAtPrototype;
import Legacy.ADotPrototype;
import Legacy.APlusPrototype;
import Legacy.AStarPrototype;
import Legacy.AXPrototype;
import Legacy.GraphPrototypeAPI;

public class ClientDataShow {

	private GraphPrototypeAPI graph;
	private Integer[] dataArray = { 3, 6, 2, 5, 7, 1, 4 };
	private List<Integer> dataList = new ArrayList<Integer>(Arrays.asList(dataArray));

	ClientDataShow() {

	}

	ClientDataShow(GraphPrototypeAPI graph) {
		this.graph = graph;
	}

	public void sort(Comparator<Integer> c) {
		this.dataList.sort(c);
	}

	public void showCharacter() {
		System.out.println("=================");
		for (int i : dataList) {
			graph.showMagnitude(i);
			System.out.println();
		}
		
		System.out.println("=================\n");

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (Integer n : this.dataList) {
			sb.append(n).append("\n");
		}

		return sb.toString();
	}

	public static void demo() {
		System.out.println(ClientDataShow.class.getName() + ".demo()...");

		/**
		 * ClientDataShow Original only using numbers
		 */
		{
			/**
			 * Show original data
			 */
			ClientDataShow obj = new ClientDataShow();
			System.out.println(obj);
			/**
			 * Show original data SORTED ASCENDING
			 */
			obj.sort((a, b) -> a - b);
			System.out.println(obj);
			/**
			 * Show original data SORTED DESCENDING
			 */
			obj.sort((a, b) -> b - a);
			System.out.println(obj);
		}

		/**
		 * ClientDataShow using AStartPrototype for bar graphing the same data
		 */
		{
			/**
			 * Show original data
			 */
			GraphPrototypeAPI graph = new AStarPrototype();
			ClientDataShow obj = new ClientDataShow(graph);
			obj.showCharacter();
			//ascending order
			obj.sort((a, b) -> a - b);
			obj.showCharacter();
			//descending order
			obj.sort((a, b) -> b - a);
			obj.showCharacter();
		}

		/**
		 * ClientDataShow using APlusPrototype for bar graphing the same data
		 */
		{
			GraphPrototypeAPI graph = new APlusPrototype();
			ClientDataShow obj = new ClientDataShow(graph);
			obj.showCharacter();
			//ascending order
			obj.sort((a, b) -> a - b);
			obj.showCharacter();
			//descending order
			obj.sort((a, b) -> b - a);
			obj.showCharacter();
		}

		/**
		 * ClientDataShow using ADotPrototype for bar graphing the same data
		 */
		{
			GraphPrototypeAPI graph = new ADotPrototype();
			ClientDataShow obj = new ClientDataShow(graph);
			obj.showCharacter();
			//ascending order
			obj.sort((a, b) -> a - b);
			obj.showCharacter();
			//descending order
			obj.sort((a, b) -> b - a);
			obj.showCharacter();
		}

		/**
		 * ClientDataShow using AXPrototype for bar graphing the same data
		 */
		{
			GraphPrototypeAPI graph = new AXPrototype();
			ClientDataShow obj = new ClientDataShow(graph);
			obj.showCharacter();
			//ascending order
			obj.sort((a, b) -> a - b);
			obj.showCharacter();
			//descending order
			obj.sort((a, b) -> b - a);
			obj.showCharacter();
		}

		/**
		 * ClientDataShow using AComercialAtPrototype (A@) for bar graphing the same
		 * data
		 */
		{
			GraphPrototypeAPI graph = new AComercialAtPrototype();
			ClientDataShow obj = new ClientDataShow(graph);
			obj.showCharacter();
			//ascending order
			obj.sort((a, b) -> a - b);
			obj.showCharacter();
			//descending order
			obj.sort((a, b) -> b - a);
			obj.showCharacter();
		}
		System.out.println(ClientDataShow.class.getName() + ".demo()... done!");
	}
}
