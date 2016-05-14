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

public class MartinOmalley extends AppCompatActivity {
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
        setContentView(R.layout.activity_martin_omalley);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvMalley);

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
        abortion.add("Abortions should be legal, without government restriction. (May 2015)");
        abortion.add("$101M for stem cell research over six years. (Feb 2012)");
        abortion.add("Supports federal abortion funding. (Aug 2010)");



        List<String> economy = new ArrayList<>();
        economy.add("Economic injustice is tearing our country apart. (Oct 2015)");
        economy.add("Fight banks that are too big to jail & too big to fail. (Oct 2015)");
        economy.add("Why weren't Wall Street CEOs convicted in 2008 meltdown? (May 2015)");
        economy.add("Reinstate Glass-Steagall: separate investments from banking. (Apr 2015)");
        economy.add("Tax reductions & regulatory reforms to help job creators. (Feb 2015)");
        economy.add("Closed $1.7 billion budget deficit in 7 years. (Jan 2014)");
        economy.add("Middle-out economics instead of trickle-down economics. (Jan 2014)");
        economy.add("Obama inherited worst economy since the Great Depression. (Sep 2012)");
        economy.add("Limit budget growth to below inflation. (Jan 2007)");



        List<String> civilRights = new ArrayList<>();
        civilRights.add("All are created equal, including gay, lesbian & transgender. (May 2015)");
        civilRights.add("Led Maryland to 2012 same-sex marriage law. (Apr 2015)");
        civilRights.add("Respect dignity of individuals & support same-sex marriage. (Jan 2014)");
        civilRights.add("Civil marriage rights for all Marylanders. (Feb 2012)");
        civilRights.add("Shift from group preferences to economic empowerment of all. (Aug 2000)");
        civilRights.add("Opposes Amendment to prevent same sex marriage. (Aug 2010)");



        List<String> corporations = new ArrayList<>();
        corporations.add("Income gap growing due to concentration of corporate power. (May 2015)");
        corporations.add("Change Maryland's anti-business attitude. (Feb 2015)");
        corporations.add("Repeal personal property tax on small business. (Feb 2015)");
        corporations.add("Maryland is #1 in businesses owned by women. (Jan 2014)");



        List<String> crime = new ArrayList<>();
        crime.add("My zero-tolerance policy didn't cause Baltimore riots. (Oct 2015)");
        crime.add("Baltimore riot due to hopelessness, not just race & policing. (May 2015)");
        crime.add("Abolish the death penalty: we're one of the last refuges. (Apr 2015)");
        crime.add("Repealed death penalty; reduced prison incarceration. (Jan 2014)");
        crime.add("Root out prison gangs and prison guard corruption. (Jun 2013)");
        crime.add("Repeal the death penalty: it does not work. (May 2013)");
        crime.add("Additional funding to hire correctional and police officers. (Jan 2007)");



        List<String> drugs = new ArrayList<>();
        drugs.add("Executive Order to address this heroin epidemic. (Feb 2015)");
        drugs.add("Proportionality in marijuana arrests, but not legalization. (Jan 2014)");
        drugs.add("Let Colorado experiment with legalization, not Maryland. (Jan 2014)");
        drugs.add("Baltimore recovered from open-air drug markets. (Nov 2013)");



        List<String> education = new ArrayList<>();
        education.add("Allow refinancing college loans & income-based repayments. (Jun 2015)");
        education.add("Encourage more public charter schools. (Feb 2015)");
        education.add("Tax credits for contributions to private & parochial schools. (Feb 2015)");
        education.add("Complete College Maryland: incentives to finish on time. (Feb 2011)");
        education.add("Give students, teachers & parents resources they need. (Nov 2006)");
        education.add("Offer every parent Charter Schools and public school choice. (Aug 2000)");
        education.add("Opposes education vouchers for public or private school. (Aug 2010)");



        List<String> energy = new ArrayList<>();
        energy.add("American jobs agenda to build a new renewable energy future. (May 2015)");
        energy.add("End the automatic gas tax increase. (Feb 2015)");
        energy.add("Raise gas tax by 2% per year, to rebuild infrastructure. (Feb 2012)");
        energy.add("Maryland needs a long-term vision to make energy affordable. (Nov 2006)");
        energy.add("Supports tradable emissions permits for greenhouse gases. (Aug 2000)");



        List<String> enviornment = new ArrayList<>();
        enviornment.add("Passed milestone of preserving 1 million acres of open space. (Jan 2014)");
        enviornment.add("Flush Tax: fund green upgrade to wastewater treatment plants. (Feb 2012)");
        enviornment.add("Adopt the Clean Cars Act to fight global warming. (Jan 2007)");



        List<String> foreignPolicy = new ArrayList<>();
        foreignPolicy.add("New foreign policy of engagement and collaboration. (May 2015)");
        foreignPolicy.add("Respect my right to shy away from foreign policy. (Apr 2013)");
        foreignPolicy.add("Israeli separation barrier might be called 'peace wall'. (Apr 2013)");
        foreignPolicy.add("Progressive Internationalism: globalize with US pre-eminence. (Aug 2000)");



        List<String> trade = new ArrayList<>();
        trade.add("Opposing bad trade deals like TPP is just common sense. (Apr 2015)");
        trade.add("Build a rule-based global trading system. (Aug 2000)");
        trade.add("Reauthorize the Ex-Im Bank. (Jul 2014)");



        List<String> guns = new ArrayList<>();
        guns.add("Ban assault weapons, limit clip size, & require fingerprints. (May 2015)");
        guns.add("Further toughen the enforcement of our gun laws. (Feb 2011)");
        guns.add("Prevent unauthorized firearm use with 'smart gun' technology. (Aug 2000)");
        guns.add("Supports restrictions on the right to bear arms. (Aug 2010)");



        List<String> healthCare = new ArrayList<>();
        healthCare.add("All-payer system: state caps medical cost & hospital fees. (May 2015)");
        healthCare.add("ObamaCare will get past the scare tactics and will work. (Feb 2014)");
        healthCare.add("ObamaCare website has problems, but we're enrolling citizens. (Jan 2014)");
        healthCare.add("Pass the Maryland healthcare act to expand health coverage. (Jan 2007)");
        healthCare.add("Health care should be a right--not a privilege. (Nov 2006)");
        healthCare.add("Establish 'report cards' on HMO quality of care. (Aug 2000)");
        healthCare.add("Supports government-run healthcare. (Aug 2010)");
        healthCare.add("Adopt national health reform legislation before the end of the year. (Oct 2009)");
        healthCare.add("3.2% funding increase for National Institutes of Health. (Apr 2010)");



        List<String> immigration = new ArrayList<>();
        immigration.add("Support DACA and DAPA, and comprehensive reform. (Oct 2015)");
        immigration.add("Comprehensive reform to bring 11 million out of shadows. (May 2015)");
        immigration.add("First state to pass the DREAM Act. (Jul 2013)");



        List<String> jobs = new ArrayList<>();
        jobs.add("Raise the minimum wage, plus collective bargaining rights. (May 2015)");
        jobs.add("Extend unemployment benefits for the long-term jobless. (Jan 2014)");
        jobs.add("Raise minimum wage to $10 per hour. (Jan 2014)");
        jobs.add("We have driven unemployment down to a three-year low. (Feb 2012)");
        jobs.add("Recovery & Reinvestment Act creates jobs; spend more locally. (Feb 2011)");



        List<String> socialSecurity = new ArrayList<>();
        socialSecurity.add("Repeal income tax on retired veterans; & later all retirees. (Feb 2015)");
        socialSecurity.add("Create Retirement Savings Accounts. (Aug 2000)");



        List<String> tax = new ArrayList<>();
        tax.add("Cut $9.1B spending with no fee nor tax increases. (Jan 2014)");
        tax.add("Cut taxes on bottom 85% while raising taxes on top 15%. (Jan 2014)");
        tax.add("$12B in federal economic stimulus as state block grants. (Jan 2008)");



        List<String> technology = new ArrayList<>();
        technology.add("$25M more for road improvements. (Feb 2015)");
        technology.add("$156M for One Maryland Broadband Network. (Feb 2012)");
        technology.add("21st Century cyber-infrastructure & rural broadband network. (Feb 2011)");
        technology.add("Chief information officer to digitize federal government. (Aug 2000)");



        List<String> war = new ArrayList<>();
        war.add("Negotiate with Iran to remove potential nuclear weapon. (May 2015)");
        war.add("Two-state solution between Israel and Palestine. (May 2015)");



        List<String> welfare = new ArrayList<>();
        welfare.add("Move from welfare to work; & raise Earned Income tax credit. (Jan 2014)");
        welfare.add("Anti-poverty programs grow our middle class. (Jan 2014)");
        welfare.add("Finish welfare reform by moving able recipients into jobs. (Aug 2000)");



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
