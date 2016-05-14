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

public class TedCruz extends AppCompatActivity {
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
        setContentView(R.layout.activity_ted_cruz);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvTed);

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
        abortion.add("Planned Parenthood sells body parts of unborn human beings. (Sep 2015)");
        abortion.add("Allow vote to end Planned Parenthood's funding. (Aug 2015)");
        abortion.add("Prosecute Planned Parenthood for criminal violations. (Aug 2015)");
        abortion.add("Ban taxpayer funding of abortion & partial birth abortion. (Mar 2015)");
        abortion.add("Companies can deny insuring birth control. (Apr 2012)");
        abortion.add("Protect innocent human life with partial-birth ban. (Jul 2011)");
        abortion.add("Opposes public abortion funding. (Oct 2012)");
        abortion.add("Opposes churches providing birth control. (Oct 2012)");



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
        civilRights.add("Don't empower more lawsuits by demanding equal pay. (Oct 2015)");
        civilRights.add("Supreme Court gay rights ruling undermines the Constitution. (Jul 2015)");
        civilRights.add("Adopt economic affirmative action instead of race-based. (Jun 2015)");
        civilRights.add("Pray against a court decision legalizing same-sex marriage. (Apr 2015)");
        civilRights.add("Liberals obsessed with mandatory gay marriage in 50 states. (Apr 2015)");
        civilRights.add("Zealotry on same-sex marriage leaves out religious liberty. (Apr 2015)");
        civilRights.add("Most states can ignore Supreme Court legalizing gay marriage. (Mar 2015)");
        civilRights.add("Overturn Supreme Court with anti-gay marriage Amendment. (Oct 2014)");
        civilRights.add("Opposes gay pride parades and opposes gay marriage. (Feb 2012)");
        civilRights.add("One-man-one-woman marriage is building block of society. (Jul 2011)");
        civilRights.add("Disallow Ku Klux Klan from participating in Adopt-A-Highway. (Jul 2011)");
        civilRights.add("Voted NO on reauthorizing the Violence Against Women Act. (Feb 2013)");
        civilRights.add("Supports defining traditional marriage. (Oct 2012)");
        civilRights.add("Sponsored state definition of marriage supersedes federal gay marriage. (Feb 2014)");



        List<String> corporations = new ArrayList<>();
        corporations.add("End sugar subsidies and corporate welfare. (Nov 2015)");
        corporations.add("Business flat tax of 16%; big business same as small. (Oct 2015)");
        corporations.add("Slash corporate tax rates to 15 percent. (Mar 2015)");
        corporations.add("Get senseless obstacles from Washington out of the way. (Jan 2015)");



        List<String> crime = new ArrayList<>();
        crime.add("Convert regulatory crimes into civil offenses. (Apr 2015)");
        crime.add("World Court should have no say in Texas executions. (Jul 2011)");
        crime.add("Fully monitor sexual predators & bring them to justice. (Jul 2011)");
        crime.add("Supports the death penalty. (Oct 2012)");
        crime.add("Rated 55% by the NAPO, indicating a moderate stance on police issues. (Dec 2014)");



        List<String> drugs = new ArrayList<>();
        drugs.add("Let's see what happens in Colorado with legalization. (Nov 2015)");
        drugs.add("Lower minimums and mandatory sentencing for drugs. (Apr 2015)");
        drugs.add("2014: federal enforcement; 2015: let states experiment. (Mar 2015)");
        drugs.add("I disagree with states legalizing pot, but it's their right. (Feb 2015)");
        drugs.add("Let states be laboratories of democracy on marijuana. (Feb 2015)");
        drugs.add("I foolishly smoked pot when young, but never since. (Feb 2015)");



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
        enviornment.add("Federal government shouldn't own $14 trillion worth of land. (Jun 2015)");
        enviornment.add("Don't pick winners & losers like RFS' ethanol in gasoline. (Mar 2015)");
        enviornment.add("Voted NO on protecting ocean, coastal, and Great Lakes ecosystems. (May 2013)");



        List<String> foreignPolicy = new ArrayList<>();
        foreignPolicy.add("Countries aspire to be like America, the exceptional nation. (Mar 2016)");
        foreignPolicy.add("Break diplomatic relations with Cuba. (Mar 2016)");
        foreignPolicy.add("Neutrality on Israel is moral relativism. (Feb 2016)");
        foreignPolicy.add("Under Hillary's leadership, every region of world is worse. (Nov 2015)");
        foreignPolicy.add("Fighting ISIS is more important than fighting Assad. (Oct 2015)");
        foreignPolicy.add("If Mideast strongmen still in power, better for US interests. (Oct 2015)");
        foreignPolicy.add("US should not engage in nation building in Afghanistan. (Oct 2015)");
        foreignPolicy.add("Don't let world courts bind American sovereignty. (Sep 2015)");
        foreignPolicy.add("Move American embassy in Israel to Jerusalem. (Sep 2015)");
        foreignPolicy.add("Law of the Sea Treaty undermines US sovereignty. (Jun 2015)");
        foreignPolicy.add("Guide policy with true leadership of moral clarity. (Jun 2015)");
        foreignPolicy.add("Cuba is oppressive but never misses chance to propagandize. (Oct 2014)");
        foreignPolicy.add("Vigorous sanctions against Putin; help eastern Ukraine. (Jul 2014)");
        foreignPolicy.add("America is indispensable; our allies need our leadership. (Jun 2014)");
        foreignPolicy.add("Sanctions on Putin for Ukraine: tyrants respond to weakness. (Mar 2014)");
        foreignPolicy.add("US has a responsibility to defend our values abroad. (Mar 2014)");
        foreignPolicy.add("Move US embassy in Israel to Jerusalem; recognize as cap. (Jan 2015)");



        List<String> trade = new ArrayList<>();
        trade.add("I always opposed TPP, but I supported TPA. (Mar 2016)");
        trade.add("Import taxes are paid by consumers, not by China. (Mar 2016)");
        trade.add("End the Export-Import Bank. (Aug 2015)");
        trade.add("The Export-Import bank is corporate welfare. (Mar 2015)");
        trade.add("Defended Chinese company on intellectual property theft. (May 2012)");
        trade.add("Dewhurst lying about defending Chinese intellectual property. (May 2012)");



        List<String> guns = new ArrayList<>();
        guns.add("Lack of individual right to guns leads to confiscation. (Jan 2016)");
        guns.add("Obama is coming for our guns. (Oct 2015)");
        guns.add("2nd Amendment is ultimate check against government tyranny. (Jun 2015)");
        guns.add("Opposes unreasonable and burdensome gun restrictions. (Jul 2011)");
        guns.add("Voted NO on banning high-capacity magazines of over 10 bullets. (Apr 2013)");
        guns.add("Opposes restricting the Second Amendment. (Oct 2012)");
        guns.add("Oppose the United Nations' Arms Trade Treaty. (Sep 2013)");



        List<String> healthCare = new ArrayList<>();
        healthCare.add("Don't exempt Congress from ObamaCare, or any law. (Nov 2015)");
        healthCare.add("I regret voting for John Roberts because of ObamaCare vote. (Sep 2015)");
        healthCare.add("Left calls it single-payer, but that's socialized medicine. (Jun 2015)");
        healthCare.add("Washington wants ObamaCare, the people want liberty. (Feb 2015)");
        healthCare.add("Support nuns' battle for religious liberty against ObamaCare. (Jan 2015)");
        healthCare.add("Government shutdown on ObamaCare worked: GOP won in 2014. (Nov 2014)");
        healthCare.add("Suspend commercial air travel to Ebola-infected areas. (Oct 2014)");
        healthCare.add("To repeal ObamaCare, show Dems they'd lose by supporting it. (Mar 2014)");
        healthCare.add("Obama changed ObamaCare mandate deadline by a blog post. (Jan 2014)");
        healthCare.add("Obama asked companies to disobey ObamaCare rules for a year. (Jan 2014)");
        healthCare.add("5 million had health insurance canceled because of ObamaCare. (Jan 2014)");
        healthCare.add("Vow to repeal ObamaCare. (Oct 2012)");
        healthCare.add("Save Medicare by raising eligibility age. (Aug 2012)");
        healthCare.add("Throw my body in front of a train to stop ObamaCare. (Apr 2012)");
        healthCare.add("Defeat ObamaCare; rein in the federal government. (Jul 2011)");
        healthCare.add("Defund, repeal, & replace federal care with free market. (Jul 2010)");
        healthCare.add("Repeal any federal health care takeover. (Aug 2012)");
        healthCare.add("Supports repealing ObamaCare. (Oct 2012)");
        healthCare.add("Supports market-based health insurance. (Oct 2012)");



        List<String> immigration = new ArrayList<>();
        immigration.add("Bar refugees from terrorist-ridden regions. (Mar 2016)");
        immigration.add("Children deported with parents can come back, if citizens. (Feb 2016)");
        immigration.add("I led the fight to defeat the Reid-Schumer amnesty bill. (Feb 2016)");
        immigration.add("FactCheck: Yes, Bill Clinton deported 12M illegal aliens. (Dec 2015)");
        immigration.add("Build a wall instead of massive amnesty plan. (Dec 2015)");
        immigration.add("Enforce the law against millions of illegals currently here. (Dec 2015)");
        immigration.add("Illegals are an economic calamity for low-wage Americans. (Nov 2015)");
        immigration.add("Support Kate's Law: oppose our leaders who won't enforce. (Aug 2015)");
        immigration.add("Path to citizenship is profoundly unfair to legal immigrants. (Feb 2015)");
        immigration.add("End Obama's illegal amnesty via Congress' checks & balances. (Nov 2014)");
        immigration.add("Defund amnesty; and refuse any nominees until rescinded. (Nov 2014)");
        immigration.add("No path to citizenship for 1.65 million illegals in Texas. (Oct 2012)");
        immigration.add("Give police more power to ask about immigration status. (Jun 2012)");
        immigration.add("Boots on the ground, plus a wall. (Apr 2012)");
        immigration.add("Triple the size of the Border Patrol. (Mar 2012)");
        immigration.add("Strengthen border security and increase enforcement. (Jul 2011)");



        List<String> jobs = new ArrayList<>();
        jobs.add("Job outlook great for lobbyists; not so great for others. (Jan 2016)");
        jobs.add("Pass a flat tax and abolish the IRS, and jobs will follow. (Sep 2015)");
        jobs.add("Raising minimum wage by executive fiat opposes rule of law. (Jan 2014)");
        jobs.add("Lowest labor force participation in over three decades. (Jan 2014)");
        jobs.add("Extending unemployment benefits exacerbates joblessness. (Aug 2012)");



        List<String> socialSecurity = new ArrayList<>();
        socialSecurity.add("Personal accounts for young; no changes for elderly. (Nov 2015)");
        socialSecurity.add("Eliminate payroll tax entirely. and IRS entirely. (Nov 2015)");
        socialSecurity.add("No changes for seniors; personal accounts for young. (Oct 2015)");
        socialSecurity.add("Implement commonsense reforms for younger workers. (Jun 2015)");
        socialSecurity.add("Raise retirement age; cap increases to inflation rate. (Aug 2012)");
        socialSecurity.add("Transition younger workers into personal savings system. (Jun 2012)");
        socialSecurity.add("Rated 0% by ARA, indicating a pro-privatization stance. (Jan 2013)");



        List<String> tax = new ArrayList<>();
        tax.add("Tax returns on a postcard. (Feb 2016)");
        tax.add("There are more words in the tax code than in the Bible. (Nov 2015)");
        tax.add("Eliminate payroll tax, death tax, business tax, and IRS. (Oct 2015)");
        tax.add("Abolish the IRS. (Feb 2015)");
        tax.add("Permanent Washington elite protects the tax code. (Apr 2012)");
        tax.add("Adopt a single-rate tax system. (Jul 2010)");
        tax.add("Repeal tax hikes in capital gains and death tax. (Jul 2010)");
        tax.add("Supports the Taxpayer Protection Pledge. (Aug 2012)");
        tax.add("Opposes increasing tax rates. (Oct 2012)");
        tax.add("Supports eliminating the inheritance tax. (Oct 2012)");
        tax.add("Replace income tax and IRS with FairTax. (Mar 2015)");



        List<String> technology = new ArrayList<>();
        technology.add("Require Apple to unlock iPhones used by terrorists. (Feb 2016)");
        technology.add("Target cell phones and tech that Bad Guys likely to use. (Dec 2015)");
        technology.add("Of course China & Russia have conducted cyberwarfare on US. (Aug 2015)");
        technology.add("Net neutrality is ObamaCare for the Internet. (Nov 2014)");
        technology.add("Voted NO on authorizing states to collect Internet sales taxes. (May 2013)");



        List<String> war = new ArrayList<>();
        war.add("U.S.-Israel alliance is a strategic bedrock. (Mar 2016)");
        war.add("Russia too strong for Syria cease-fire to hold. (Feb 2016)");
        war.add("Overwhelming air power against ISIS, & arm the Kurds. (Feb 2016)");
        war.add("Our enemies will feel our full force & fury. (Jan 2016)");
        war.add("FactCheck: No, ISIS and Iran haven't declared war on America. (Dec 2015)");
        war.add("Assad is bad, but toppling him gives Syria to ISIS. (Dec 2015)");
        war.add("When terrorists join ISIS, they sign U.S. death warrant. (Dec 2015)");
        war.add("If you wage jihad on America, you sign your death warrant. (Aug 2015)");
        war.add("Toughen sanctions on Iran, to safeguard America. (Mar 2015)");
        war.add("Provide defensive weapons for Ukraine against Russia. (Feb 2015)");
        war.add("Arm the Kurds to fight ISIS, with US air support. (Feb 2015)");
        war.add("Focused, direct military objective of destroying ISIS. (Feb 2015)");
        war.add("Bomb ISIS back to the Stone Age. (Oct 2014)");
        war.add("Arm & aid the Peshmerga Kurds against ISIS. (Oct 2014)");
        war.add("Don't arm Syrian rebels without a clear plan to combat ISIS. (Sep 2014)");
        war.add("Bomb ISIS back into the Stone Age, with Congress' approval. (Sep 2014)");
        war.add("Install Eastern European ABMs; stand up to Russia in Ukraine. (Jun 2014)");
        war.add("Wars in Iraq and Afghanistan went on too long. (Jun 2012)");
        war.add("Sponsored shutting down Iranian foreign reserves. (May 2013)");



        List<String> welfare = new ArrayList<>();
        welfare.add("Regulations like ObamaCare lead to layoffs of the poorest. (Feb 2016)");
        welfare.add("FactCheck: Yes, 3.7M women became impoverished since 2008. (Oct 2015)");
        welfare.add("If you really want to help needy, use private charities. (Jun 2015)");
        welfare.add("Government checks create dependency. (Aug 2012)");



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
