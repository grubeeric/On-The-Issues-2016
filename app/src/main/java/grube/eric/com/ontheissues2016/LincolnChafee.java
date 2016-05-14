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

public class LincolnChafee extends AppCompatActivity {
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
        setContentView(R.layout.activity_lincoln_chafee);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvChafee);

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
        abortion.add("Support right to woman's personal reproductive decisions. (Jun 2015)");
        abortion.add("A woman should make her own reproductive decisions. (Sep 2012)");
        abortion.add("Emotional & divisive abortion debate takes over other issues. (Apr 2008)");
        abortion.add("Opposed Alito because he didn't respect right to privacy. (Apr 2008)");
        abortion.add("Embryonic stem cell research could help with many diseases. (Sep 2006)");
        abortion.add("Leaving abortion to states means only wealthy have choice. (Sep 2006)");
        abortion.add("The real potential for cures is in the embryonic stem cells. (Aug 2006)");
        abortion.add("Opposed the Alito nomination on 3 issues, not litmus test. (Aug 2006)");
        abortion.add("Strongly supports “Abortion is a woman’s right”. (Sep 2000)");
        abortion.add("Voted NO on notifying parents of minors who get out-of-state abortions. (Jul 2006)");
        abortion.add("Voted YES on $100M to reduce teen pregnancy by education & contraceptives. (Mar 2005)");
        abortion.add("Voted NO on criminal penalty for harming unborn fetus during other crime. (Mar 2004)");
        abortion.add("Voted NO on banning partial birth abortions except for maternal life. (Mar 2003)");
        abortion.add("Voted NO on maintaining ban on Military Base Abortions. (Jun 2000)");
        abortion.add("Rated 90% by NARAL, indicating a pro-choice voting record. (Dec 2003)");
        abortion.add("Expand embryonic stem cell research. (Jun 2004)");
        abortion.add("Sponsored bill for emergency contraception for rape victims. (Sep 2006)");



        List<String> economy = new ArrayList<>();
        economy.add("Widening disparity of wealth hurts the middle class. (Apr 2015)");
        economy.add("100-Day, 10-Point Economic Plan for RI development. (Nov 2010)");
        economy.add("Reinstitute pay-as-you-go: match tax cuts & spending cuts. (Sep 2006)");
        economy.add("Pork barrel accounts for 1% of the budget, and is requested. (Aug 2006)");
        economy.add("Voted NO on $40B in reduced federal overall spending. (Dec 2005)");
        economy.add("Voted NO on prioritizing national debt reduction below tax cuts. (Apr 2000)");
        economy.add("Maintain & enforce existing spending caps in the future. (Sep 1998)");



        List<String> civilRights = new ArrayList<>();
        civilRights.add("People of color are the future of Rhode Island. (Jan 2014)");
        civilRights.add("Longtime supporter of the LGBTQ community. (Nov 2010)");
        civilRights.add("1964: Opposing Civil Rights Act was wrong side of history. (Apr 2008)");
        civilRights.add("2006: Marriage Amendment ignores states' rights. (Apr 2008)");
        civilRights.add("Gay marriage is a state issue, not for federal constitution. (Sep 2006)");
        civilRights.add("Supports “Sexual orientation protected by civil rights laws”. (Sep 2000)");
        civilRights.add("Continue affirmative action programs. (Jan 2000)");
        civilRights.add("Voted NO on recommending Constitutional ban on flag desecration. (Jun 2006)");
        civilRights.add("Voted NO on constitutional ban of same-sex marriage. (Jun 2006)");
        civilRights.add("Voted YES on adding sexual orientation to definition of hate crimes. (Jun 2002)");
        civilRights.add("Voted YES on loosening restrictions on cell phone wiretapping. (Oct 2001)");
        civilRights.add("Voted YES on expanding hate crimes to include sexual orientation. (Jun 2000)");
        civilRights.add("Require 90 day delay for compliance before ADA lawsuits. (May 2002)");
        civilRights.add("Limit interstate class-action lawsuits to federal courts . (May 2002)");
        civilRights.add("Rated 60% by the ACLU, indicating a mixed civil rights voting record. (Dec 2002)");



        List<String> corporations = new ArrayList<>();
        corporations.add("Voted NO on repealing tax subsidy for companies which move US jobs offshore. (Mar 2005)");
        corporations.add("Voted YES on reforming bankruptcy to include means-testing & restrictions. (Mar 2005)");
        corporations.add("Voted YES on restricting rules on personal bankruptcy. (Jul 2001)");
        corporations.add("Rated 57% by the US COC, indicating a mixed business voting record. (Dec 2003)");



        List<String> crime = new ArrayList<>();
        crime.add("Focus on inmate skills & treatment. (Jan 2000)");
        crime.add("Rated 63% by CURE, indicating mixed votes on rehabilitation. (Dec 2000)");
        crime.add("More funding and stricter sentencing for hate crimes. (Apr 2001)");
        crime.add("Require DNA testing for all federal executions. (Mar 2001)");



        List<String> drugs = new ArrayList<>();
        drugs.add("Decriminalized small amounts of marijuana as governor. (Jun 2015)");
        drugs.add("I doubt our culture would allow legalizing hard drugs. (Apr 2008)");
        drugs.add("Discuss implementation of 'Plan Colombia'. (Sep 2000)");



        List<String> education = new ArrayList<>();
        education.add("$6 million for RI higher education: make tuition affordable. (Jun 2015)");
        education.add("Supports NCLB’s standardized testing, if federally funded. (Sep 2006)");
        education.add("Fund special education before tax cuts for the wealthy. (Aug 2006)");
        education.add("Supports parents choosing schools via vouchers. (Sep 2000)");
        education.add("Supports vouchers & charters, plus more public funding. (Jan 2000)");
        education.add("Voted NO on $52M for '21st century community learning centers'. (Oct 2005)");
        education.add("Voted NO on $5B for grants to local educational agencies. (Oct 2005)");
        education.add("Voted YES on shifting $11B from corporate tax loopholes to education. (Mar 2005)");
        education.add("Voted NO on funding smaller classes instead of private tutors. (May 2001)");
        education.add("Voted NO on funding student testing instead of private tutors. (May 2001)");
        education.add("Voted YES on spending $448B of tax cut on education & debt reduction. (Apr 2001)");
        education.add("Voted NO on Educational Savings Accounts. (Mar 2000)");
        education.add("Focus educational resources to help those with greatest need. (Jul 2001)");
        education.add("Require state standards, regular assessments, and sanctions. (Jul 2001)");
        education.add("Support Ed-Flex: more flexibility if more accountable. (Jul 2001)");
        education.add("Rated 55% by the NEA, indicating a mixed record on public education. (Dec 2003)");



        List<String> energy = new ArrayList<>();
        energy.add("Close the SUV loophole and raise mileage standards overall. (Apr 2008)");
        energy.add("ANWR: Let's leave just one place off limits. (Apr 2008)");
        energy.add("Supports spending resources to stop Global Warming. (Sep 2000)");
        energy.add("Voted YES on disallowing an oil leasing program in Alaska's ANWR. (Nov 2005)");
        energy.add("Voted YES on $3.1B for emergency oil assistance for hurricane-hit areas. (Oct 2005)");
        energy.add("Voted YES on reducing oil usage by 40% by 2025 (instead of 5%). (Jun 2005)");
        energy.add("Voted YES on banning drilling in the Arctic National Wildlife Refuge. (Mar 2005)");
        energy.add("Voted YES on Bush Administration Energy Policy. (Jul 2003)");
        energy.add("Voted YES on targeting 100,000 hydrogen-powered vehicles by 2010. (Jun 2003)");
        energy.add("Voted YES on removing consideration of drilling ANWR from budget bill. (Mar 2003)");
        energy.add("Voted NO on drilling ANWR on national security grounds. (Apr 2002)");
        energy.add("Voted NO on terminating CAFE standards within 15 months. (Mar 2002)");
        energy.add("Voted NO on preserving budget for ANWR oil drilling. (Apr 2000)");
        energy.add("Keep efficient air conditioner rule to conserve energy. (Mar 2004)");
        energy.add("Establish greenhouse gas tradeable allowances. (Feb 2005)");
        energy.add("Letter to Congress supporting renewable energy tax credit. (Nov 2011)");
        energy.add("Supports immediate reductions in greenhouse gases. (Sep 1998)");



        List<String> enviornment = new ArrayList<>();
        enviornment.add("Proper respect for our natural world & vulnerable species. (Jun 2015)");
        enviornment.add("We believe in environmental stewardship. (Sep 2012)");
        enviornment.add("Committee vote killed Bush's 'Clear Skies' initiative. (Feb 2012)");
        enviornment.add("2000: Cleanup abandoned urban brownfields. (Apr 2008)");
        enviornment.add("Voted YES on including oil & gas smokestacks in mercury regulations. (Sep 2005)");
        enviornment.add("Voted YES on confirming Gale Norton as Secretary of Interior. (Jan 2001)");
        enviornment.add("Reduce liability for hazardous waste cleanup. (May 2001)");
        enviornment.add("Supports grants for brownfields remediation. (May 2002)");
        enviornment.add("Make EPA into a Cabinet department. (May 2002)");
        enviornment.add("Rated 79% by the LCV, indicating pro-environment votes. (Dec 2003)");
        enviornment.add("EPA must do better on mercury clean-up. (Apr 2004)");
        enviornment.add("Focus on results, not regulation. (Sep 1998)");



        List<String> foreignPolicy = new ArrayList<>();
        foreignPolicy.add("End prevailing attitude of arrogant reckless war. (Sep 2012)");
        foreignPolicy.add("Hugo Chavez does not fit into all-good-or-all-bad rhetoric. (Apr 2008)");
        foreignPolicy.add("War against Islamic extremism hinges on Pakistan. (Apr 2008)");
        foreignPolicy.add("Castro doesn't want end to Cuban embargo. (Apr 2008)");
        foreignPolicy.add("Strong supporter of Palestinian-Israeli land-for-peace deal. (Apr 2008)");
        foreignPolicy.add("Opposes linking Human Rights to trade with China. (Sep 2000)");
        foreignPolicy.add("Supports continuing Foreign Aid to Russia, Israel, & others. (Sep 2000)");
        foreignPolicy.add("Voted YES on enlarging NATO to include Eastern Europe. (May 2002)");
        foreignPolicy.add("Voted YES on killing a bill for trade sanctions if China sells weapons. (Sep 2000)");



        List<String> trade = new ArrayList<>();
        trade.add("Supports Trans-Pacific Partnership. (Jun 2015)");
        trade.add("Voted YES on implementing CAFTA for Central America free-trade. (Jul 2005)");
        trade.add("Voted YES on establishing free trade between US & Singapore. (Jul 2003)");
        trade.add("Voted YES on establishing free trade between the US and Chile. (Jul 2003)");
        trade.add("Voted YES on extending free trade to Andean nations. (May 2002)");
        trade.add("Voted YES on granting normal trade relations status to Vietnam. (Oct 2001)");
        trade.add("Voted YES on removing common goods from national security export rules. (Sep 2001)");
        trade.add("Voted YES on permanent normal trade relations with China. (Sep 2000)");
        trade.add("Voted YES on expanding trade to the third world. (May 2000)");
        trade.add("Promote the Andean Free Trade Agreement. (May 2002)");
        trade.add("Rated 92% by CATO, indicating a pro-free trade voting record. (Dec 2002)");
        trade.add("Reauthorize the Ex-Im Bank. (Jul 2014)");



        List<String> guns = new ArrayList<>();
        guns.add("Common sense adherence to the Second Amendment. (Jun 2015)");
        guns.add("Voted NO on prohibiting lawsuits against gun manufacturers. (Jul 2005)");
        guns.add("Voted NO on banning lawsuits against gun manufacturers for gun violence. (Mar 2004)");



        List<String> healthCare = new ArrayList<>();
        healthCare.add("Individual mandate ok; universal coverage better. (Jun 2015)");
        healthCare.add("Watch Mass’ individual mandates as possible national model. (Sep 2006)");
        healthCare.add("Bipartisanship is the key to reform Medicare. (Aug 2006)");
        healthCare.add("Support Canadian drug importation that Laffey opposes. (Aug 2006)");
        healthCare.add("Supports More Federal Funding for Health Coverage. (Sep 2000)");
        healthCare.add("Voted YES on limiting medical liability lawsuits to $250,000. (May 2006)");
        healthCare.add("Voted YES on expanding enrollment period for Medicare Part D. (Feb 2006)");
        healthCare.add("Voted NO on increasing Medicaid rebate for producing generics. (Nov 2005)");
        healthCare.add("Voted YES on negotiating bulk purchases for Medicare prescription drug. (Mar 2005)");
        healthCare.add("Voted YES on $40 billion per year for limited Medicare prescription drug benefit. (Jun 2003)");
        healthCare.add("Voted YES on allowing reimportation of Rx drugs from Canada. (Jul 2002)");
        healthCare.add("Voted YES on allowing patients to sue HMOs & collect punitive damages. (Jun 2001)");
        healthCare.add("Voted NO on funding GOP version of Medicare prescription drug benefit. (Apr 2001)");
        healthCare.add("Voted YES on including prescription drugs under Medicare. (Jun 2000)");
        healthCare.add("Invest funds to alleviate the nursing shortage. (Apr 2001)");
        healthCare.add("Tax credits for those without employee health insurance. (May 2002)");
        healthCare.add("Tax deduction for long-term care insurance. (May 2002)");
        healthCare.add("Support telemedicine for underserved areas. (May 2002)");
        healthCare.add("$350 billion for prescriptions for poor seniors. (May 2002)");
        healthCare.add("Rated 75% by APHA, indicating a pro-public health record. (Dec 2003)");



        List<String> immigration = new ArrayList<>();
        immigration.add("In-state tuition for undocumented immigrants. (Jun 2015)");
        immigration.add("Supports legalization path & guest worker programs. (Nov 2010)");
        immigration.add("Co-sponsored McCain-Kennedy immigration bill. (Aug 2006)");
        immigration.add("Laffey supported then opposed ID cards for illegal aliens. (Aug 2006)");
        immigration.add("More programs for legal immigrants. (Jan 2000)");
        immigration.add("Voted NO on building a fence along the Mexican border. (Sep 2006)");
        immigration.add("Voted YES on establishing a Guest Worker program. (May 2006)");
        immigration.add("Voted YES on allowing illegal aliens to participate in Social Security. (May 2006)");
        immigration.add("Voted YES on giving Guest Workers a path to citizenship. (May 2006)");
        immigration.add("English immersion over bilingual education. (Jul 2001)");
        immigration.add("Comprehensive immigration reform without amnesty. (May 2005)");
        immigration.add("Sponsored bill covering child resident aliens under Medicaid. (May 2005)");



        List<String> jobs = new ArrayList<>();
        jobs.add("Rhode Island had 2nd best job growth under my watch. (Oct 2015)");
        jobs.add("Increase the minimum wage. (Jan 2000)");
        jobs.add("Voted YES on raising the minimum wage to $7.25 rather than $6.25. (Mar 2005)");
        jobs.add("Voted YES on repealing Clinton's ergonomic rules on repetitive stress. (Mar 2001)");
        jobs.add("Rated 31% by the AFL-CIO, indicating an anti-union voting record. (Dec 2003)");



        List<String> socialSecurity = new ArrayList<>();
        socialSecurity.add("Don’t put Soc. Sec. benefits at risk. (Sep 2006)");
        socialSecurity.add("Supports privatizing Social Security. (Sep 2000)");
        socialSecurity.add("Rated 30% by the ARA, indicating an anti-senior voting record. (Dec 2003)");
        socialSecurity.add("Supports individual savings accounts and work incentives. (Sep 1998)");



        List<String> tax = new ArrayList<>();
        tax.add("I voted against every Bush tax cut favoring the wealthy. (Jun 2015)");
        tax.add("2000: Repeal the marriage tax penalty. (Apr 2008)");
        tax.add("Draw down budget surplus to pay to abolish Marriage Tax. (Apr 2008)");
        tax.add("Opposes making income tax flatter & lower. (Sep 2000)");
        tax.add("Voted NO on supporting permanence of estate tax cuts. (Aug 2006)");
        tax.add("Voted NO on permanently repealing the `death tax`. (Jun 2006)");
        tax.add("Voted YES on $47B for military by repealing capital gains tax cut. (Feb 2006)");
        tax.add("Voted NO on retaining reduced taxes on capital gains & dividends. (Feb 2006)");
        tax.add("Voted NO on extending the tax cuts on capital gains and dividends. (Nov 2005)");
        tax.add("Voted NO on $350 billion in tax breaks over 11 years. (May 2003)");
        tax.add("Voted YES on reducing marriage penalty instead of cutting top tax rates. (May 2001)");
        tax.add("Voted NO on increasing tax deductions for college tuition. (May 2001)");
        tax.add("Voted YES on eliminating the 'marriage penalty'. (Jul 2000)");
        tax.add("Voted NO on phasing out the estate tax ('death tax'). (Jul 2000)");
        tax.add("Rated 46% by NTU, indicating 'Satisfactory' on tax votes. (Dec 2003)");
        tax.add("Implement socially fair, broad-based tax cuts. (Sep 1998)");



        List<String> technology = new ArrayList<>();
        technology.add("No tapping of our phones without a warrant. (Jun 2015)");
        technology.add("Sales & use tax on online sellers with no physical presence. (Jan 2014)");
        technology.add("Voted YES on restoring $550M in funding for Amtrak for 2007. (Mar 2006)");
        technology.add("Voted YES on disallowing FCC approval of larger media conglomerates. (Sep 2003)");



        List<String> war = new ArrayList<>();
        war.add("Yes, government has a role in struggle against poverty. (Jan 2014)");
        war.add("Supports allowing churches to provide welfare services. (Sep 2000)");
        war.add("Establish a National Affordable Housing Trust Fund. (Jul 2003)");
        war.add("Tax credits to promote home ownership in distressed areas. (Apr 2003)");
        war.add("Fully fund AmeriCorps. (Jun 2003)");



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
