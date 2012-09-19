package cma.store.control.opt;

import java.util.ArrayList;
import java.util.List;

import cma.store.data.Bot;
import cma.store.data.Mvc;
import cma.store.data.MvcType;
import cma.store.input.request.BaseRequest;
import cma.store.input.request.LocPriority;

/**
creating date: 2012-05-21
creating time: 01:04:12
autor: Czarek
 */

public class RouteChooseTest_6 extends  RouteChooseAbs{

	public RouteChooseTest_6(long seed) {
		super(seed);
	}
	public RouteChooseTest_6() {
		super();
	}

	@Override
	public List<Bot> createBots(){
		List<Bot> bots = new ArrayList<Bot>();
		bots.add( createBot( 0,20) );
		bots.add( createBot( 0,13) );
		//bots.add( createBot( 6,0) );
		//bots.add( createBot( 8,0) );
		return bots;
	}
		


	@Override
	public List<BaseRequest> getBaseRequest() {
		List<BaseRequest> baseRequestList = new ArrayList<BaseRequest>();
		
		//BOT1
		//available product
		List<LocPriority> productList1 = new ArrayList<LocPriority>(); 
		productList1.add( new LocPriority( createPos(0,26), 0.99)  );

		//destination
		Mvc mvc1 = getMvc(MvcType.INPUT,0);
		BaseRequest br1 = new BaseRequest( 1, mvc1, productList1 );
		baseRequestList.add(br1);
		
		//BOT2
		//available product
		List<LocPriority> productList2 = new ArrayList<LocPriority>(); 
		productList2.add( new LocPriority( createPos(0,10), 0.99) ); 
		
		//destination
		Mvc mvc2 = getMvc(MvcType.INPUT,1);

		BaseRequest br2 = new BaseRequest( 2, mvc2, productList2 );
		//baseRequestList.add(br2);		

		
		return baseRequestList;
	}



	public static void main(String[] args) {
		RouteChooseTest_6 t = new RouteChooseTest_6(123);
		//t.setTeamPlaninngContext(new TeamPlaninngContext( new NearestFreeBotStrategy(t.env)));
		t.runTest();

	}



}
