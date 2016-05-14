package grube.eric.com.ontheissues2016;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class JimWebb extends AppCompatActivity {
    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(Build.VERSION.SDK_INT>=21){
            Explode explode = new Explode();
            explode.setDuration(1000);
            getWindow().setEnterTransition(explode);
        }
        setContentView(R.layout.activity_jim_webb);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvWebb);

        //preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        //setting list adapter
        expListView.setAdapter(listAdapter);
    }

    //Preparing the list data
    private void prepareListData(){
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        //Array stores the header titles
        String[] topics = {"Abortion", "Budget and Economy", "Civil Rights", "Corporations", "Crime", "Drugs", "Education", "Energy and Oil", "Enviornment", "Foreign Policy", "Free Trade", "Gun Control", "Health Care",
                "Immigration", "Jobs", "Social Security", "Tax Reform", "Technology", "War and Peace", "Welfare and Poverty"};

        //Adding header data
        for(int i = 0; i < topics.length; i++){
            listDataHeader.add(topics[i]);
        }

        //Adding child data
        List<String> abortion = new ArrayList<>();
        abortion.add("Supports Roe v. Wade and abortion rights. (Jun 2006)");
        abortion.add("Voted NO on restricting UN funding for population control policies. (Mar 2009)");
        abortion.add("Voted NO on defining unborn child as eligible for SCHIP. (Mar 2008)");
        abortion.add("Voted NO on prohibiting minors crossing state lines for abortion. (Mar 2008)");
        abortion.add("Voted NO on barring HHS grants to organizations that perform abortions. (Oct 2007)");
        abortion.add("Voted YES on expanding research to more embryonic stem cell lines. (Apr 2007)");



        List<String> economy = new ArrayList<>();
        economy.add("Cut budget by bottom-up review of all programs. (Jul 2015)");
        economy.add("Top of economy doing great; but workers not. (Jan 2007)");
        economy.add("Voted YES on $192B additional anti-recession stimulus spending. (Jul 2009)");
        economy.add("Voted YES on modifying bankruptcy rules to avoid mortgage foreclosures. (May 2009)");
        economy.add("Voted YES on additional $825 billion for economic recovery package. (Feb 2009)");
        economy.add("Voted YES on $60B stimulus package for jobs, infrastructure, & energy. (Sep 2008)");
        economy.add("Voted NO on paying down federal debt by rating programs' effectiveness. (Mar 2007)");
        economy.add("Reform mortgage rules to prevent foreclosure & bankruptcy. (Feb 2008)");



        List<String> civilRights = new ArrayList<>();
        civilRights.add("Evolution on gay marriage has been good for the country. (Oct 2014)");
        civilRights.add("Affirmative action should apply to African-Americans only. (Sep 2006)");
        civilRights.add("Supports civil unions; opposes constitutional ban. (Jun 2006)");
        civilRights.add("Opposes constitutional ban of gay marriage. (Jun 2006)");
        civilRights.add("Government’s power should end at my front door. (Apr 2006)");
        civilRights.add("Realign politics by union of Scots-Irish & African Americans. (Jan 2006)");
        civilRights.add("ENDA: prohibit employment discrimination for gays. (Jun 2009)");



        List<String> corporations = new ArrayList<>();
        corporations.add("If you've got capital, you're feeling pretty good. (Oct 2014)");
        corporations.add("GOP puts corporate interests first; Dems put workers first. (Apr 2006)");
        corporations.add("Rated 86% by UFCW, indicating an anti-management/pro-labor record. (May 2012)");



        List<String> crime = new ArrayList<>();
        crime.add("Holistic plan to bring hardened criminals to justice. (Apr 2015)");
        crime.add("Independent commission: restructure criminal justice system. (Apr 2015)");
        crime.add("Voted NO on reinstating $1.15 billion funding for the COPS Program. (Mar 2007)");
        crime.add("Reduce recidivism by giving offenders a Second Chance. (Mar 2007)");



        List<String> drugs = new ArrayList<>();
        drugs.add("Drug courts to deal with drugs as a sickness. (Apr 2015)");



        List<String> education = new ArrayList<>();
        education.add("Public education levels the playing field. (May 2006)");
        education.add("Voted YES on additional $10.2B for federal education & HHS projects. (Oct 2007)");



        List<String> energy = new ArrayList<>();
        energy.add("Energy expansion: Keystone XL and off-coast drilling. (Jul 2015)");
        energy.add("Bush called for energy independence every year since 2001. (Jan 2007)");
        energy.add("Support alternative sources instead of drilling ANWR. (Jun 2006)");
        energy.add("Voted NO on barring EPA from regulating greenhouse gases. (Apr 2011)");
        energy.add("Voted YES on protecting middle-income taxpayers from a national energy tax. (Apr 2009)");
        energy.add("Voted YES on requiring full Senate debate and vote on cap-and-trade. (Apr 2009)");
        energy.add("Voted YES on tax incentives for energy production and conservation. (Jun 2008)");
        energy.add("Voted YES on addressing CO2 emissions without considering India & China. (May 2008)");
        energy.add("Voted YES on removing oil & gas exploration subsidies. (Jun 2007)");
        energy.add("Voted YES on making oil-producing and exporting cartels illegal. (Jun 2007)");
        energy.add("Voted NO on factoring global warming into federal project planning. (May 2007)");
        energy.add("Sign on to UN Framework Convention on Climate Change. (Jan 2007)");



        List<String> enviornment = new ArrayList<>();
        enviornment.add("More funding to reduce traffic congestion. (Oct 2006)");
        enviornment.add("Voted YES on $2 billion more for Cash for Clunkers program. (Aug 2009)");
        enviornment.add("Voted NO on prohibiting eminent domain for use as parks or grazing land. (Dec 2007)");
        enviornment.add("Make tax deduction permanent for conservation easements. (Mar 2009)");
        enviornment.add("Rated 0% by HSLF, indicating an anti-animal welfare voting record. (Jan 2012)");



        List<String> foreignPolicy = new ArrayList<>();
        foreignPolicy.add("We need a clearly articulated doctrine for the Mideast. (Oct 2014)");
        foreignPolicy.add("Arab Spring: stay out if no Americans at risk. (Oct 2014)");
        foreignPolicy.add("Focus on strategic threats like China, not Iraq. (Apr 2006)");
        foreignPolicy.add("Voted YES on cooperating with India as a nuclear power. (Oct 2008)");
        foreignPolicy.add("Rated +1 by AAI, indicating a mixed Arab/Palestine voting record. (May 2012)");
        foreignPolicy.add("Allow travel between the United States and Cuba. (Feb 2009)");



        List<String> trade = new ArrayList<>();
        trade.add("Enforce existing trade laws to create fair trade. (May 2006)");
        trade.add("GOP free trade dream world costs American jobs. (Apr 2006)");
        trade.add("Voted YES on promoting free trade with Peru. (Dec 2007)");



        List<String> guns = new ArrayList<>();
        guns.add("Access to guns is a critical self-defense right. (Jul 2015)");
        guns.add("Voted YES on allowing firearms in checked baggage on Amtrak trains. (Apr 2009)");
        guns.add("Voted YES on prohibiting foreign & UN aid that restricts US gun ownership. (Sep 2007)");
        guns.add("Allow veterans to register unlicensed guns acquired abroad. (Jun 2011)");
        guns.add("Ban gun registration & trigger lock law in Washington DC. (Mar 2007)");
        guns.add("Dangerousness, not mental incompetence, limits gun rights. (Mar 2009)");



        List<String> healthCare = new ArrayList<>();
        healthCare.add("ObamaCare should have been more narrowly focused. (Jul 2015)");
        healthCare.add("Focus on health access, not on corporate profits. (May 2006)");
        healthCare.add("Don’t let drug companies write Rx drug plan. (Apr 2006)");
        healthCare.add("Voted NO on the Ryan Budget: Medicare choice, tax & spending cuts. (May 2011)");
        healthCare.add("Voted YES on regulating tobacco as a drug. (Jun 2009)");
        healthCare.add("Voted YES on expanding the Children's Health Insurance Program. (Jan 2009)");
        healthCare.add("Voted YES on overriding veto on expansion of Medicare. (Jul 2008)");
        healthCare.add("Voted NO on means-testing to determine Medicare Part D premium. (Mar 2008)");
        healthCare.add("Voted NO on allowing tribal Indians to opt out of federal healthcare. (Feb 2008)");
        healthCare.add("Voted YES on adding 2 to 4 million children to SCHIP eligibility. (Nov 2007)");
        healthCare.add("Voted YES on requiring negotiated Rx prices for Medicare part D. (Apr 2007)");
        healthCare.add("Establish a national childhood cancer database. (Mar 2007)");
        healthCare.add("Preserve access to Medicaid & SCHIP during economic downturn. (Apr 2008)");



        List<String> immigration = new ArrayList<>();
        immigration.add("Supports DREAM Act: legal status for undocumented children. (Jul 2015)");
        immigration.add("Secure the border first; them deal with other aspects. (Oct 2006)");
        immigration.add("Tamper-proof ID card; stricter enforcement against employers. (Jun 2006)");
        immigration.add("Allow illegal immigrants a path to citizenship. (Jun 2006)");
        immigration.add("Voted YES on continuing federal funds for declared 'sanctuary cities'. (Mar 2008)");
        immigration.add("Voted NO on comprehensive immigration reform. (Jun 2007)");
        immigration.add("Voted YES on declaring English as the official language of the US government. (Jun 2007)");
        immigration.add("Voted YES on eliminating the 'Y' nonimmigrant guestworker program. (May 2007)");



        List<String> jobs = new ArrayList<>();
        jobs.add("I will lead the ANTI out-sourcing of American jobs. (Apr 2006)");
        jobs.add("Voted YES on extending unemployment benefits from 39 weeks to 59 weeks. (Nov 2008)");
        jobs.add("Voted YES on overriding presidential veto of Farm Bill. (Jun 2008)");
        jobs.add("Voted NO on terminating legal challenges to English-only job rules. (Mar 2008)");
        jobs.add("Voted YES on limiting farm subsidies to people earning under $750,000. (Dec 2007)");
        jobs.add("Voted YES on restricting employer interference in union organizing. (Jun 2007)");
        jobs.add("Voted YES on increasing minimum wage to $7.25. (Feb 2007)");
        jobs.add("Ban discriminatory compensation; allow 2 years to sue. (Jan 2009)");



        List<String> socialSecurity = new ArrayList<>();
        socialSecurity.add("Opposes using Social Security taxes for private accounts. (Sep 2006)");
        socialSecurity.add("Voted NO on establishing reserve funds & pre-funding for Social Security. (Mar 2007)");



        List<String> tax = new ArrayList<>();
        tax.add("Raise taxes on capital gains but not on regular pay. (Jul 2015)");
        tax.add("Our tax policy is creating a permanent underclass. (May 2006)");
        tax.add("Our tax policies make no sense. (Apr 2006)");
        tax.add("Voted YES on increasing tax rate for people earning over $1 million. (Mar 2008)");
        tax.add("Voted NO on allowing AMT reduction without budget offset. (Mar 2008)");
        tax.add("Voted NO on raising the Death Tax exemption to $5M from $1M. (Feb 2008)");
        tax.add("Voted NO on repealing the Alternative Minimum Tax. (Mar 2007)");
        tax.add("Voted NO on raising estate tax exemption to $5 million. (Mar 2007)");



        List<String> technology = new ArrayList<>();
        technology.add("Crumbling infrastructure results from failed leadership. (May 2006)");
        technology.add("Voted YES on $23B instead of $4.9B for waterway infrastructure. (Nov 2007)");
        technology.add("Permanent ban on state & local taxation of Internet access. (Oct 2007)");



        List<String> war = new ArrayList<>();
        war.add("Iraq invasion empowered Iran & led to sectarian violence. (Oct 2014)");
        war.add("Anti-ISIS alliances are fluid; we've trained some ISIS. (Oct 2014)");
        war.add("Bush took us into this war recklessly; we predicted chaos. (Jan 2007)");
        war.add("Bush can join us in ending war, or we will show him the way. (Jan 2007)");
        war.add("US has patiently endured a mismanaged war for 4 years. (Jan 2007)");
        war.add("Shift toward diplomacy & leave Iraq in short order. (Jan 2007)");
        war.add("No patriotism question when Eisenhower questioned Korean War. (Oct 2006)");
        war.add("We’re burning out our troops in Iraq. (Sep 2006)");
        war.add("Terrorists are in Iraq because we invaded, not vice-versa. (Sep 2006)");
        war.add("Saddam and al Qaeda were natural enemies. (Sep 2006)");
        war.add("Iran cooperated with US in Afghanistan, until “Axis of Evil”. (Sep 2006)");
        war.add("$300B better spent on Iraqi containment. (Sep 2006)");
        war.add("Convene international conference to involve others in Iraq. (Sep 2006)");
        war.add("No Mideast peace as long as US forces are in Iraq. (Sep 2006)");
        war.add("It was a mistake to go to Iraq; said so before Senate vote. (Jun 2006)");
        war.add("America is fighting the wrong war in Iraq. (May 2006)");
        war.add("Honors troops but questions Bush’s strategic errors. (Apr 2006)");
        war.add("A cogent critic of the war in Iraq. (Jan 2006)");
        war.add("Opposed the War on Iraq on pragmatic grounds. (Jan 2006)");
        war.add("Voted NO on redeploying non-essential US troops out of Iraq in 9 months. (Dec 2007)");
        war.add("Voted NO on designating Iran's Revolutionary Guards as terrorists. (Sep 2007)");
        war.add("Voted YES on redeploying US troops out of Iraq by March 2008. (Mar 2007)");



        List<String> welfare = new ArrayList<>();
        welfare.add("Voted YES on instituting National Service as a new social invention. (Mar 2009)");





        //Header, child data for the put
        listDataChild.put(listDataHeader.get(0), abortion);
        listDataChild.put(listDataHeader.get(1), economy);
        listDataChild.put(listDataHeader.get(2), civilRights);
        listDataChild.put(listDataHeader.get(3), corporations);
        listDataChild.put(listDataHeader.get(4), crime);
        listDataChild.put(listDataHeader.get(5), drugs);
        listDataChild.put(listDataHeader.get(6), education);
        listDataChild.put(listDataHeader.get(7), energy);
        listDataChild.put(listDataHeader.get(8), enviornment);
        listDataChild.put(listDataHeader.get(9), foreignPolicy);
        listDataChild.put(listDataHeader.get(10), trade);
        listDataChild.put(listDataHeader.get(11), guns);
        listDataChild.put(listDataHeader.get(12), healthCare);
        listDataChild.put(listDataHeader.get(13), immigration);
        listDataChild.put(listDataHeader.get(14), jobs);
        listDataChild.put(listDataHeader.get(15), socialSecurity);
        listDataChild.put(listDataHeader.get(16), tax);
        listDataChild.put(listDataHeader.get(17), technology);
        listDataChild.put(listDataHeader.get(18), war);
        listDataChild.put(listDataHeader.get(19), welfare);
    }

}
