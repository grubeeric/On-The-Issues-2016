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

public class JohnKasich extends AppCompatActivity {
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
        setContentView(R.layout.activity_john_kasich);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvJohn);

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
        abortion.add("Defund Planned Parenthood, like we are trying in Ohio. (Sep 2015)");
        abortion.add("Federal shutdown ineffective in defunding Planned Parenthood. (Sep 2015)");
        abortion.add("Reasonable exceptions, but respect other opinions. (Aug 2015)");
        abortion.add("Admire pregnant women who don't treat cancer to protect baby. (Jun 2010)");
        abortion.add("Pro-life except rape & incest; supports litmus test. (Apr 1999)");
        abortion.add("Voted YES on banning partial-birth abortions. (Apr 2000)");
        abortion.add("Voted YES on barring transporting minors to get an abortion. (Jun 1999)");
        abortion.add("Opposes federal abortion funding. (Aug 2010)");



        List<String> economy = new ArrayList<>();
        economy.add("Original sponsor of Audit-The-Fed bill. (Jan 2016)");
        economy.add("Would I bail out the banks again? Absolutely not!. (Nov 2015)");
        economy.add("I would not bail out Bank of America. (Nov 2015)");
        economy.add("1.2% annual growth over last 8 years is a disaster. (Nov 2015)");
        economy.add("Audit the Fed; then end quantitative easing. (Oct 2015)");
        economy.add("Use debt limit as leverage for policy change. (Oct 2015)");
        economy.add("Top 1% under Obama got fat & happy while workers are hurting. (Feb 2015)");
        economy.add("Lost Generation: Obama agenda hammers young people. (Mar 2014)");
        economy.add("Balanced budget amendment to stop bankrupting our country. (Mar 2014)");
        economy.add("Choice is more federal spending, or free markets & liberty. (Aug 2012)");
        economy.add("FactCheck: Yes, gross federal debt now exceeds GDP. (Aug 2012)");
        economy.add("Demand a Balanced Budget amendment. (Jul 2010)");
        economy.add("Limit federal spending growth to per-capita inflation rate. (Jul 2010)");
        economy.add("Supports a constitutional BBA. (Oct 2012)");
        economy.add("Supports the Cut-Cap-and-Balance Pledge. (Jan 2012)");
        economy.add("Endorsed by the Club for Growth, for pro-growth stances. (Aug 2012)");
        economy.add("Audit the Federal Reserve & its actions on mortgage loans. (Feb 2013)");



        List<String> civilRights = new ArrayList<>();
        civilRights.add("Pray for customers with whom you disagree, but sell to them. (Feb 2016)");
        civilRights.add("Government employees should comply with gay marriage ruling. (Sep 2015)");
        civilRights.add("Can respect and love gay people. (Aug 2015)");
        civilRights.add("I attended a gay wedding; accept the Supreme Court ruling. (Aug 2015)");
        civilRights.add("I support traditional marriage, but it's time to move on. (Jun 2015)");
        civilRights.add("Admires courage of Aung San Suu Kyi & Rosa Parks. (Jun 2010)");
        civilRights.add("Made speech in high school to ease tensions during race riot. (May 2006)");
        civilRights.add("End “racial profiling” locally, or federally. (May 1999)");
        civilRights.add("Affirmative action OK via recruitment; not via quotas. (May 1999)");
        civilRights.add("Voted YES on banning gay adoptions in DC. (Jul 1999)");
        civilRights.add("Voted YES on ending preferential treatment by race in college admissions. (May 1998)");
        civilRights.add("Supports Amendment to prevent same sex marriage. (Aug 2010)");



        List<String> corporations = new ArrayList<>();
        corporations.add("Never let depositors lose their bank deposits. (Nov 2015)");
        corporations.add("Worked for Lehman Brothers before the Great Recession. (Oct 2015)");
        corporations.add("FactCheck: Managing Director at Lehman, but not Board member. (Oct 2015)");
        corporations.add("No income taxes on small businesses up to $2M. (Feb 2015)");
        corporations.add("OpEd: Don't pick winners & losers? Offers 12 tax credits. (Oct 2005)");



        List<String> crime = new ArrayList<>();
        crime.add("Save money by converting prisoners to taxpayers. (Aug 2015)");
        crime.add("Community must understand challenge of police & deadly force. (Aug 2015)");
        crime.add("Death penalty is consistent with justice & Christian values. (May 2015)");
        crime.add("My policies worked to integrate police and community in Ohio. (May 2015)");
        crime.add("Columbine victims showed courage by not renouncing God. (Jun 2010)");
        crime.add("It's God's job to judge if punishment fits the crime. (Jun 2010)");
        crime.add("Columbine: Community involvement, not new laws. (May 1999)");
        crime.add("Voted NO on funding for alternative sentencing instead of more prisons. (Jun 2000)");
        crime.add("Voted YES on more prosecution and sentencing for juvenile crime. (Jun 1999)");
        crime.add("Voted NO on maintaining right of habeas corpus in Death Penalty Appeals. (Mar 1996)");
        crime.add("Voted YES on making federal death penalty appeals harder. (Feb 1995)");
        crime.add("Voted NO on replacing death penalty with life imprisonment. (Apr 1994)");
        crime.add("Supports capital punishment for certain crimes. (Aug 2010)");
        crime.add("More prisons, more enforcement, effective death penalty. (Sep 1994)");



        List<String> drugs = new ArrayList<>();
        drugs.add("Don't send mixed signals to kids by legalizing. (Oct 2015)");
        drugs.add("The tsunami of drugs threatens families. (Aug 2015)");
        drugs.add("50% lower chance of drug use if kids hear don't do drugs. (Feb 2015)");
        drugs.add("Refuse to celebrate the drug-filled lifestyle. (May 2006)");
        drugs.add("Voted YES on prohibiting needle exchange & medical marijuana in DC. (Oct 1999)");



        List<String> education = new ArrayList<>();
        education.add("Race-to-the-Top is blackmail against the states. (Mar 2016)");
        education.add("Abolish the U.S. Department of Education. (Apr 2015)");
        education.add("The rich already have school choice; give it to the poor. (Apr 2015)");
        education.add("Supports ending racial preferences for college admissions. (Apr 2015)");
        education.add("Right to education: public, private, charter, or homeschool. (Mar 2015)");
        education.add("We should thank parents who homeschool. (Mar 2015)");
        education.add("Local control of education instead of Common Core. (Mar 2015)");
        education.add("Facilitate school choice for poor Americans. (Jan 2014)");
        education.add("Education decisions best made at local level. (Jun 2012)");
        education.add("Denounce the Common Core State Standards. (Feb 2014)");
        education.add("Block funding for Common Core; it's too heavy-handed. (Apr 2014)");



        List<String> energy = new ArrayList<>();
        energy.add("Fight against Gulf moratorium on offshore exploration. (Jul 2011)");
        energy.add("Signed the No Climate Tax Pledge by AFP. (Aug 2012)");
        energy.add("Cap-and-trade has no impact on global temperatures. (Jul 2010)");
        energy.add("Explore proven energy reserves & keep energy prices low. (Jul 2010)");
        energy.add("Let states lease energy rights on federal lands. (Jun 2013)");



        List<String> enviornment = new ArrayList<>();
        enviornment.add("We should not worship environment like pantheists. (Jun 2015)");
        enviornment.add("Strengthen Clean Water Act; increase federal grazing fees. (Nov 1996)");
        enviornment.add("Manage the environment to bequest it to future. (Apr 1999)");
        enviornment.add("Environment and economy are not at odds. (Apr 1999)");
        enviornment.add("Devolve enviro policy-making to State and community. (Apr 1999)");
        enviornment.add("Examples of local enviro policy successes. (Apr 1999)");



        List<String> foreignPolicy = new ArrayList<>();
        foreignPolicy.add("I have a longer track record with Israel than any candidate. (Feb 2016)");
        foreignPolicy.add("Chinese are best way to calm down North Korea. (Feb 2016)");
        foreignPolicy.add("US should not be world's police in places like Iraq. (Feb 2016)");
        foreignPolicy.add("Supports Saudi Arabia but knock it off with radical clerics. (Jan 2016)");
        foreignPolicy.add("We need coalition of Arab countries, like Bush-41 did. (Jan 2016)");
        foreignPolicy.add("Pause accepting Syrian refugees to create stringent checks. (Nov 2015)");
        foreignPolicy.add("China doesn't own the South China Sea; show US Navy there. (Nov 2015)");
        foreignPolicy.add("No more dickering & delays: Syria's Assad has got to go. (Oct 2015)");
        foreignPolicy.add("Keep Iran accountable, WITHIN the existing Nuclear Deal. (Sep 2015)");
        foreignPolicy.add("Syrian refugee situation is fundamentally a European crisis. (Sep 2015)");
        foreignPolicy.add("Refugee crisis is on Europe, but US also has responsibility. (Sep 2015)");
        foreignPolicy.add("Fight ISIS with a coalition including US ground troops. (Jul 2015)");
        foreignPolicy.add("Phase out economic aid to Russia & others. (Nov 1996)");
        foreignPolicy.add("No diplomatic relations with Cuba nor Vietnam. (Nov 1996)");
        foreignPolicy.add("Heed the clear warning of the Cox Report. (May 1999)");
        foreignPolicy.add("Engage internationally but choose missions carefully. (Apr 1999)");
        foreignPolicy.add("Focus on terrorism, oil, & nuclear development. (Mar 1999)");
        foreignPolicy.add("Voted YES on $156M to IMF for 3rd-world debt reduction. (Jul 2000)");
        foreignPolicy.add("Voted YES on Permanent Normal Trade Relations with China. (May 2000)");
        foreignPolicy.add("Voted YES on $15.2 billion for foreign operations. (Nov 1999)");



        List<String> trade = new ArrayList<>();
        trade.add("Shut down trade when countries dump in America. (Mar 2016)");
        trade.add("I support fair trade against dumping, to protect steel. (Jan 2016)");
        trade.add("TPP is a strategic alliance against China. (Nov 2015)");
        trade.add("Supports NAFTA and GATT. (Nov 1996)");
        trade.add("Voted NO on withdrawing from the WTO. (Jun 2000)");
        trade.add("Voted YES on 'Fast Track' authority for trade agreements. (Sep 1998)");



        List<String> guns = new ArrayList<>();
        guns.add("Registering mentally ill is first priority in gun control. (Nov 2015)");
        guns.add("2nd Amendment advocate: NRA rating changed from F to A. (Aug 2015)");
        guns.add("Keep existing restrictions, but tighten up on terrorist guns. (Nov 1996)");
        guns.add("Cool off before making new gun laws after Littleton. (May 1999)");
        guns.add("More parenting better than more gun laws. (May 1999)");
        guns.add("Voted YES on decreasing gun waiting period from 3 days to 1. (Jun 1999)");
        guns.add("Opposes restrictions on the right to bear arms. (Aug 2010)");



        List<String> healthCare = new ArrayList<>();
        healthCare.add("Give financial incentive for low cost & good outcomes. (Feb 2016)");
        healthCare.add("Ohio expanded Medicaid but not for ObamaCare. (Feb 2016)");
        healthCare.add("We save $22,500 a year by treating addicts & mentally ill. (Feb 2016)");
        healthCare.add("We reduced Medicaid funding by 7.5% with no benefit cuts. (Nov 2015)");
        healthCare.add("Ohio took Medicaid from 10% to 2.5%. (Oct 2015)");
        healthCare.add("Expand Medicaid; everybody has a right to God-given purpose. (Aug 2015)");
        healthCare.add("Opposes ObamaCare but not all public programs. (Aug 2015)");
        healthCare.add("Shift funding from nursing homes to home-based care. (Mar 2015)");
        healthCare.add("Accepted ObamaCare's Medicaid expansion statewide. (Feb 2015)");
        healthCare.add("Expand Medicaid to 275,000 poor Ohioans, but not ObamaCare. (Oct 2013)");
        healthCare.add("$776B tax cut plan helps people afford health care. (Mar 1999)");
        healthCare.add("Voted YES on subsidizing private insurance for Medicare Rx drug coverage. (Jun 2000)");
        healthCare.add("Voted YES on banning physician-assisted suicide. (Oct 1999)");
        healthCare.add("Voted YES on establishing tax-exempt Medical Savings Accounts. (Oct 1999)");
        healthCare.add("Opposes government-run healthcare. (Aug 2010)");
        healthCare.add("Opposes physician-assisted suicide. (Aug 2010)");
        healthCare.add("Loosen one-size-fits-all approach to Medicaid. (Jan 2011)");
        healthCare.add("Collect data on birth defects and present to the public. (Apr 1998)");



        List<String> immigration = new ArrayList<>();
        immigration.add("Nuts to deport 11M people; legalize with fine & back taxes. (Feb 2016)");
        immigration.add("It's a silly argument to ship 11M illegals back to Mexico. (Nov 2015)");
        immigration.add("Focus of immigration should be to keep families together. (Sep 2015)");
        immigration.add("Latino immigrants will continue to play critical role in US. (Sep 2015)");
        immigration.add("Focus on border & guest workers, not birthright citizenship. (Sep 2015)");
        immigration.add("1993: end birthright citizenship; 2015: not part of approach. (Aug 2015)");
        immigration.add("Seal the border with Mexico, support legal immigrants. (Jul 2015)");
        immigration.add("Open to pathway to citizenship, but doesn't like it. (Feb 2015)");
        immigration.add("Post-Sept-11 open-door melting-pot is essentially intact. (May 2006)");
        immigration.add("Limit the number of legal immigrants, and their benefits. (Nov 1996)");
        immigration.add("Voted YES on more immigrant visas for skilled workers. (Sep 1998)");
        immigration.add("Declared English the official language of the US. (Jan 1999)");



        List<String> jobs = new ArrayList<>();
        jobs.add("I created jobs in Congress & in Ohio; let's make it thrice. (Nov 2015)");
        jobs.add("When you balance the budget & cut taxes, people get work. (Nov 2015)");
        jobs.add("Don't raise minimum wage willy-nilly, & do it at state level. (Sep 2015)");
        jobs.add("Limit collective-bargaining rights for public employees. (Mar 2015)");
        jobs.add("2011: Public employee union reforms overturned by voters. (Feb 2015)");
        jobs.add("No strikes allowed for public employees. (Nov 2013)");
        jobs.add("Incentives to businesses create jobs & raise wages. (Sep 1994)");



        List<String> socialSecurity = new ArrayList<>();
        socialSecurity.add("Fix Social Security by lowering benefits. (Oct 2015)");
        socialSecurity.add("More 18-year-olds believe in UFOs than in getting Soc.Sec. (May 2006)");
        socialSecurity.add("Personal Retirement Savings Accounts invest 2% privately. (May 1999)");
        socialSecurity.add("Voted YES on reducing tax payments on Social Security benefits. (Jul 2000)");
        socialSecurity.add("Reduce taxes on Social Security earnings. (Sep 1994)");



        List<String> tax = new ArrayList<>();
        tax.add("My plan is no fantasy; I moved Ohio from $8B to $2B surplus. (Oct 2015)");
        tax.add("No taxes on small business; kill the death tax. (Oct 2015)");
        tax.add("Eliminated the Ohio estate tax but hiked cigarette taxes. (Mar 2015)");
        tax.add("$3 billion in tax cuts for job creators. (Feb 2015)");
        tax.add("Lower taxes to create competitive climate. (Nov 2010)");
        tax.add("1970s: In Ohio Senate, unwilling to raise taxes. (May 2006)");
        tax.add("10% tax cut to promote charitable giving. (May 1999)");
        tax.add("Tax credits (100%) for charitable donations. (May 1999)");
        tax.add("$776B tax cut plan helps people afford health care. (Mar 1999)");
        tax.add("Voted YES on eliminating the marriage penalty. (Jul 2000)");
        tax.add("Voted YES on $46 billion in tax cuts for small business. (Mar 2000)");
        tax.add("Opposes both marriage penalty & federal tax increases. (Aug 2010)");
        tax.add("Supports the Taxpayer Protection Pledge. (Jan 2012)");
        tax.add("Repeal marriage tax; cut middle class taxes. (Sep 1994)");



        List<String> technology = new ArrayList<>();
        technology.add("Get Silicon Valley people to solve Pentagon problems. (Jan 2016)");
        technology.add("Broadcast Judeo-Christian values abroad, to help defeat ISIS. (Nov 2015)");
        technology.add("Replace Rust Belt with Cloud computing and 3-D printing. (Feb 2015)");
        technology.add("Faith matters, but so does building up expertise. (Jun 2010)");
        technology.add("Journalists should ask, Am I reporting or pimping?. (May 2006)");
        technology.add("Do better job labeling movies for graphic content. (May 2006)");



        List<String> war = new ArrayList<>();
        war.add("We need more than Special Forces in Libya. (Mar 2016)");
        war.add("Arm the Ukrainians and fight ISIS in Syria, Libya. (Feb 2016)");
        war.add("How to deal with Russia on Ukraine: Punch 'em in the nose. (Feb 2016)");
        war.add("If there weren't WMDs in Iraq, we shouldn't have gone. (Feb 2016)");
        war.add("Find moderate rebels in Syria; work with them against Assad. (Dec 2015)");
        war.add("No-fly zone 1st priority, but ok with more aid for refugees. (Nov 2015)");
        war.add("Invading force but no occupying force in Syria. (Nov 2015)");
        war.add("US ground troops in Syria, but not involved in civil war. (Nov 2015)");
        war.add("Work with allies like Israel, Egypt, Jordan. (Nov 2015)");
        war.add("Destroy ISIS, with US troops as part of coalition. (Nov 2015)");
        war.add("No-fly zone in Syria & sanctuaries, enforced by U.S. (Oct 2015)");
        war.add("Constitution requires Congress' approval of Iran nuke deal. (Sep 2015)");
        war.add("We operate better in the world when our allies work with us. (Sep 2015)");
        war.add("I'm a cheap hawk: Cut Pentagon waste, but not spending. (Sep 2015)");
        war.add("Fight ISIS by supporting Kurds and educating Iraqis. (Aug 2015)");
        war.add("Iran nuke deal: verify, verify, verify, without the trust. (Apr 2015)");
        war.add("Congressional debate before sending in ground troops. (May 1999)");
        war.add("Russian mediation with Milosevic instead of a ground war. (Apr 1999)");
        war.add("Should have used economic tools with rest of world. (Apr 1999)");
        war.add("Russia should mediate; Congress should vote on escalation. (Apr 1999)");
        war.add("Maintain aggression but negotiate with Milosevic. (Apr 1999)");
        war.add("Ground war not in humanitarian nor international interest. (Apr 1999)");
        war.add("Goals should be: help refugees & regional development. (Apr 1999)");
        war.add("Rambouillet goals breached sovereignty of Yugoslavia. (Apr 1999)");
        war.add("Use neutral mediators; be flexible on post-war force. (Apr 1999)");
        war.add("Make clear-cut goals and timetables, then commit. (Mar 1999)");
        war.add("Voted YES on disallowing the invasion of Kosovo. (May 1999)");



        List<String> welfare = new ArrayList<>();
        welfare.add("Let's reform welfare for rich people as well as poor. (Oct 2015)");
        welfare.add("There are moral and practical reasons to help the poor. (Aug 2015)");
        welfare.add("Matthew 25 commands us to aid the less fortunate. (Mar 2015)");
        welfare.add("People who played by the rules suffered; act decisively now. (Feb 2015)");
        welfare.add("Reach out and help those who live in the shadows. (Feb 2015)");
        welfare.add("Replace war on the poor with Christian compassion. (Oct 2013)");
        welfare.add("Chaired committee which overhauled the welfare system. (Nov 2010)");
        welfare.add("Focus next phase of welfare reform on fathers. (May 1999)");
        welfare.add("Voted YES on responsible fatherhood via faith-based organizations. (Nov 1999)");
        welfare.add("Limit welfare to 2 years & cut welfare spending. (Sep 1994)");







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
