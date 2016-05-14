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

public class RandPaul extends AppCompatActivity {
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
        setContentView(R.layout.activity_rand_paul);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvRand);

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
        abortion.add("Stop flow of taxpayer dollars to fund abortions. (Apr 2015)");
        abortion.add("Supports 'Plan B' morning-after contraception. (Oct 2014)");
        abortion.add("Supports religious freedom to deny contraceptive coverage. (Jun 2014)");
        abortion.add("Thousands of exceptions follow from maternal health. (May 2013)");
        abortion.add("Personhood at conception, including embryonic stem cells. (Apr 2013)");
        abortion.add("Coarsening of our culture led to 50 million unborn deaths. (Sep 2012)");
        abortion.add("My opponents call me libertarian but I'm pro-life. (Feb 2011)");
        abortion.add("Life begins at conception. (Jul 2010)");
        abortion.add("Opposes federal abortion funding. (Aug 2010)");
        abortion.add("Prohibit federal funding for abortion. (May 2011)");



        List<String> economy = new ArrayList<>();
        economy.add("Borrowing a million a minute has gotta stop somewhere. (Aug 2015)");
        economy.add("Reform the tax code; address the national debt. (Apr 2015)");
        economy.add("Federal Reserve is insolvent, by private bank standards. (Feb 2015)");
        economy.add("More oversight of the Fed; less of community banks. (Feb 2015)");
        economy.add("Audit the Fed: currently no jurisdiction to do so. (Feb 2015)");
        economy.add("Is the Fed too big to be audited? (Feb 2015)");
        economy.add("We borrow $1M per minute; mandate a balanced budget. (Jan 2015)");
        economy.add("The sequester is the law of the land: can't compromise on it. (Oct 2013)");
        economy.add("We cannot continue to borrow $50,000 per second. (Mar 2013)");
        economy.add("Sequester doesn't cut spending; it just slows rate of growth. (Mar 2013)");
        economy.add("FactCheck: US borrowing $30,000 per second, not $50,000. (Feb 2013)");
        economy.add("Borrowing $50,000 per second is not sustainable. (Feb 2013)");
        economy.add("America needs Adam Smith, not Robin Hood. (Feb 2013)");
        economy.add("Penny Plan: Each $1 by one penny & balance budget by 2019. (Feb 2013)");
        economy.add("Keep the sequester, and increase it to $4T. (Feb 2013)");
        economy.add("Not every military dollar is necessary,nor every entitlement. (Aug 2012)");
        economy.add("Roll back federal spending to 2008 levels. (Jan 2012)");
        economy.add("We are borrowing $40,000 per second. (Jan 2012)");
        economy.add("Government not serious about controlling spending. (Feb 2011)");
        economy.add("Larger government is not a solution for economy. (Feb 2011)");
        economy.add("Debt crisis is approaching a point of no return. (Feb 2011)");
        economy.add("No federal bailouts of private industry. (Jul 2010)");
        economy.add("Bank bailout represented everything wrong with Washington. (Feb 2011)");
        economy.add("Bank bailout was bad policy & helped no banks in KY. (Oct 2010)");
        economy.add("Demand a Balanced Budget amendment. (Jul 2010)");
        economy.add("Limit federal spending growth to per-capita inflation rate. (Jul 2010)");
        economy.add("Sponsored bill increasing debt limit to $16.7 trillion. (Jul 2011)");
        economy.add("Supports the Cut-Cap-and-Balance Pledge. (Jan 2012)");
        economy.add("Disapprove of increasing the debt limit. (Jan 2012)");
        economy.add("Sponsored auditing the Fed & its actions on mortgage loans. (Feb 2013)");
        economy.add("Endorsed Liberty Candidate: End the Federal Reserve. (Sep 2010)");



        List<String> civilRights = new ArrayList<>();
        civilRights.add("Resist government imposing religious views of marriage. (Aug 2015)");
        civilRights.add("Marriage for heterosexuals; contracts for same-sex couples. (Apr 2015)");
        civilRights.add("Stand up for Bill of Rights against federal usurpation. (Apr 2015)");
        civilRights.add("I don't believe in rights based on your behavior. (Mar 2015)");
        civilRights.add("Gay contracts ok, but gay marriage is offensive. (Mar 2015)");
        civilRights.add("OpEd: Disagrees with Libertarian Party on social issues. (Jan 2015)");
        civilRights.add("Don't register guns federally, nor marriages. (Dec 2014)");
        civilRights.add("Voter ID laws offend African Americans. (May 2014)");
        civilRights.add("Women won the 'war on women': they're no longer downtrodden. (Jan 2014)");
        civilRights.add("Redefining marriage leads to economic and moral problems. (Jun 2013)");
        civilRights.add("No national law on same-sex marriage; leave it to states. (May 2013)");
        civilRights.add("Make federal benefits equal for gay couples. (Mar 2013)");
        civilRights.add("Let states decide same-sex marriage; don't federalize it. (Mar 2013)");
        civilRights.add("Illegal to impose racial segregation in the private sector. (May 2010)");
        civilRights.add("Opposes same-sex marriage. (Nov 2009)");
        civilRights.add("Voted NO on reauthorizing the Violence Against Women Act. (Feb 2013)");
        civilRights.add("Opposes affirmative action. (Aug 2010)");
        civilRights.add("Supports Amendment to prevent same sex marriage. (Aug 2010)");



        List<String> corporations = new ArrayList<>();
        corporations.add("No safety net cuts until corporate welfare is all cut. (Jan 2015)");
        corporations.add("Most small businesses fail, & government often picks wrong. (Jan 2014)");
        corporations.add("Cut corporate tax in half to create millions of jobs. (Feb 2013)");
        corporations.add("Kelo decision was dangerous landmark in US law. (Sep 2012)");
        corporations.add("Punishing the rich means the poor lose their jobs. (Aug 2012)");
        corporations.add("Obama's 'You didn't build that' insults American workers. (Aug 2012)");
        corporations.add("Stop subsidizing profitable large multinational corporations. (Mar 2012)");
        corporations.add("Expand lending caps for credit unions to small business. (Mar 2012)");
        corporations.add("Rated 14% by UFCW, indicating a pro-management voting record. (May 2012)");



        List<String> crime = new ArrayList<>();
        crime.add("Stop transferring military equipment to local police forces. (May 2015)");
        crime.add("Stop transferring military equipment to local police. (Apr 2015)");
        crime.add("Focus on violent criminals, not nonviolent African-Americans. (Apr 2015)");
        crime.add("REDEEM Act: seal non-violent criminal records to allow jobs. (Apr 2015)");
        crime.add("Restore federal right to vote to non-violent felons. (Apr 2015)");
        crime.add("Defend the whole Bill of Rights, including speedy trials. (Feb 2015)");
        crime.add("Defend the 4th & 5th Amendments against Big Government. (Feb 2015)");
        crime.add("Blacks look who's in prison & conclude cops out to get them. (Aug 2014)");
        crime.add("Death penalty is a state issue. (Jul 2014)");
        crime.add("Let convicted felons regain the right to vote. (Jun 2014)");
        crime.add("Justice cannot occur without a trial, especially minorities. (Mar 2014)");
        crime.add("Defend trial by jury & oppose unlawful searches. (Feb 2013)");
        crime.add("Stop over-criminalization in vague laws like Lacey Act. (Sep 2012)");
        crime.add("Lacey Act applies foreign laws to US citizens. (Sep 2012)");
        crime.add("Many criminal statutes lack requirement of criminal intent. (Sep 2012)");



        List<String> drugs = new ArrayList<>();
        drugs.add("End hypocrisy and over-criminalization of marijuana. (Feb 2015)");
        drugs.add("Jailing people for 10 years for marijuana is ridiculous. (Nov 2014)");
        drugs.add("Whites & blacks use drugs, but prisons are full of blacks. (Jul 2014)");
        drugs.add("War on drugs has unintentionally had a racial outcome. (Jun 2014)");
        drugs.add("Don't promote marijuana but don't jail non-violent criminals. (Mar 2013)");
        drugs.add("Tackle drug problem; no one cares where funding comes from. (Oct 2010)");
        drugs.add("Community treatment instead of federal anti-drug programs. (Aug 2010)");
        drugs.add("Drug abuse isn't a pressing issue; 10-20 years is too harsh. (Aug 2010)");
        drugs.add("Favors legalizing medical marijuana. (May 2010)");
        drugs.add("Exclude industrial hemp from definition of marijuana. (Aug 2012)");
        drugs.add("Exempt industrial hemp from marijuana laws. (Feb 2013)");



        List<String> education = new ArrayList<>();
        education.add("Don't constrict kids to one-size-fits-all Common Core. (Apr 2015)");
        education.add("Charters & flexibility instead of federal one-size-fits-all. (Jan 2015)");
        education.add("Washington-based metrics stifle new ideas & innovation. (Oct 2013)");
        education.add("Why tax federally to send money back to local schools? (Oct 2013)");
        education.add("Federal student loans are ok, if within spending limits. (Apr 2013)");
        education.add("Allow school choice for everyone, white, brown, or black. (Feb 2013)");
        education.add("No Child Left Behind is federal takeover of schools. (Feb 2012)");
        education.add("Support homeschooling and parental responsibility. (Jul 2010)");



        List<String> energy = new ArrayList<>();
        energy.add("Cut red tape to allow energy freedom & traditional energy. (Apr 2015)");
        energy.add("Compete on the free market, including nuclear plants. (Jan 2015)");
        energy.add("Develop mineral & energy resources on public lands. (Jan 2015)");
        energy.add("Supports Keystone XL, plus domestic oil & gas exploration. (Jan 2015)");
        energy.add("Test older gas pipelines for explosion safety. (Sep 2012)");
        energy.add("End subsidies to solar companies; they're donation kickbacks. (Mar 2012)");
        energy.add("Unelected EPA should not regulate greenhouse emissions. (Oct 2010)");
        energy.add("Energy crisis stems from too much government intervention. (Jul 2010)");
        energy.add("Voted YES on barring EPA from regulating greenhouse gases. (Apr 2011)");
        energy.add("Signed the No Climate Tax Pledge by AFP. (Nov 2010)");
        energy.add("Supports renewable energy tax credits. (Aug 2010)");
        energy.add("Cap-and-trade has no impact on global temperatures. (Jul 2010)");
        energy.add("Explore proven energy reserves & keep energy prices low. (Jul 2010)");
        energy.add("Let states lease energy rights on federal lands. (Jun 2013)");
        energy.add("Endorsed Liberty Candidate: tax incentives for US-based alternatives. (Sep 2010)");



        List<String> enviornment = new ArrayList<>();
        enviornment.add("Balance environmental safety with business deregulation. (Apr 2015)");
        enviornment.add("Hurricane Sandy relief ads were conflict of interest. (Nov 2013)");
        enviornment.add("Hurricane recovery money is bankrupting the government. (Jul 2013)");
        enviornment.add("Our federal government regulates everything and anything. (Sep 2012)");
        enviornment.add("Citizens run afoul of vague definition of 'wetlands'. (Sep 2012)");
        enviornment.add("EPA regulations cost $15 trillion in 2012. (Sep 2012)");
        enviornment.add("EPA enforcement nullifies due process and judicial review. (Sep 2012)");
        enviornment.add("Land rules made by delusional government interventionists. (Sep 2012)");
        enviornment.add("Navigable waters should mean permanently flowing. (Sep 2012)");
        enviornment.add("Voted NO on protecting ocean, coastal, and Great Lakes ecosystems. (May 2013)");
        enviornment.add("Rated 20% by HSLF, indicating an anti-animal welfare voting record. (Jan 2012)");



        List<String> foreignPolicy = new ArrayList<>();
        foreignPolicy.add("Quit sending aid to countries who hate us. (Aug 2015)");
        foreignPolicy.add("U.S. intervention in Libya strengthened Islamic State. (Apr 2015)");
        foreignPolicy.add("Stand with Israel Act: no US funds to Palestinian Authority. (Apr 2015)");
        foreignPolicy.add("2011: eliminate all foreign aid & rebuild America instead. (Apr 2015)");
        foreignPolicy.add("Crazy for North Korea to use force; we'd declare war. (Jan 2015)");
        foreignPolicy.add("Where do Ron and Rand Paul disagree on foreign issues? (Jan 2015)");
        foreignPolicy.add("Good idea to end Cuba embargo; it hasn't worked. (Dec 2014)");
        foreignPolicy.add("50-year embargo with Cuba hasn't worked; lift it. (Dec 2014)");
        foreignPolicy.add("Normalizing relations with Cuba can lead to positive change. (Dec 2014)");
        foreignPolicy.add("Temporary stop on elective travel to fight Ebola. (Nov 2014)");
        foreignPolicy.add("No quarantine on returning Ebola doctors unless symptomatic. (Nov 2014)");
        foreignPolicy.add("GOP hawks fear my world view, but Americans support it. (May 2014)");
        foreignPolicy.add("Neocons are neoisolationist: 'all should behave like us'. (May 2014)");
        foreignPolicy.add("Eventually end all foreign aid, but unrealistic for now. (May 2014)");
        foreignPolicy.add("We don't need grandstanding tough talk against Russia. (Mar 2014)");
        foreignPolicy.add("My worldview: engage both friend and foe in dialogue. (Jan 2014)");
        foreignPolicy.add("Prioritize embassy security to avoid another Benghazi. (Oct 2013)");
        foreignPolicy.add("No isolationism; but don't go abroad seeking enemies. (Oct 2013)");
        foreignPolicy.add("Against terror but first comes preserving the Constitution. (Jul 2013)");
        foreignPolicy.add("US aid enables a war on Christianity in the Middle East. (Jun 2013)");
        foreignPolicy.add("End US aid to countries that burn our flag. (Mar 2013)");
        foreignPolicy.add("Stop sending foreign aid to people who don't like us. (Sep 2012)");
        foreignPolicy.add("Freeze aid to Egypt until they release detained Americans. (Sep 2012)");
        foreignPolicy.add("As only democracy in Mideast, Israel is important ally. (Feb 2011)");
        foreignPolicy.add("Exit the UN; maintain US sovereignty. (Nov 2010)");
        foreignPolicy.add("Rated 0 by AAI, indicating a mixed Arab/Palestine voting record. (May 2012)");
        foreignPolicy.add("Endorsed Liberty Candidate: US abroad unconstitutional & unaffordable. (Sep 2010)");



        List<String> trade = new ArrayList<>();
        trade.add("China trade improves economy AND makes fight less likely. (Jan 2014)");
        trade.add("Accompany free trade laws with other export inducers. (Oct 2013)");
        trade.add("Participated with Raw Milk Freedom Riders civil disobedience. (Sep 2012)");



        List<String> guns = new ArrayList<>();
        guns.add("Oppose laws which would limit the right to gun ownership. (Apr 2015)");
        guns.add("Don't let the liberals tread on the Second Amendment. (Feb 2013)");
        guns.add("Patriot Act violates your gun rights. (Feb 2011)");
        guns.add("2nd amendment is only as good as the fourth amendment. (Sep 2010)");
        guns.add("Supports 2nd amendment; vote against restricting handguns. (Jul 2010)");
        guns.add("Voted NO on banning high-capacity magazines of over 10 bullets. (Apr 2013)");
        guns.add("Opposes restrictions on the right to bear arms. (Aug 2010)");
        guns.add("Rated AQ by the NRA, indicating a pro-gun rights voting record. (Aug 2010)");
        guns.add("Oppose the United Nations' Arms Trade Treaty. (Sep 2013)");
        guns.add("Endorsed Liberty Candidate: no point in keeping guns you can't access. (Sep 2010)");



        List<String> healthCare = new ArrayList<>();
        healthCare.add("GOP has been fighting single-payer for a decade. (Aug 2015)");
        healthCare.add("Health system was over-regulated before ObamaCare. (Apr 2015)");
        healthCare.add("Encourage vaccines, with religious exceptions. (Feb 2015)");
        healthCare.add("Parents own their children, and can choose to not vaccinate. (Feb 2015)");
        healthCare.add("Compassion cannot be delivered in the form of coercion. (Jan 2015)");
        healthCare.add("Supports tort reform & free-market principles. (Jan 2015)");
        healthCare.add("ObamaCare cuts hundreds of choices down to just four. (Nov 2013)");
        healthCare.add("It's Congress' job to fight to change ObamaCare. (Oct 2013)");
        healthCare.add("Protect vitamin manufacturers from unreasonable regulations. (Sep 2012)");
        healthCare.add("ObamaCare is still unconstitutional, despite Supreme Court. (Aug 2012)");
        healthCare.add("No mandatory mental health screening in schools. (Nov 2011)");
        healthCare.add("Restrain ObamaCare from using Commerce Clause. (Feb 2011)");
        healthCare.add("Obamacare will cost $3T & health insurance still goes up 15%. (Oct 2010)");
        healthCare.add("Replace over-regulation with free market principles. (Jul 2010)");
        healthCare.add("Voted NO on the Ryan Budget: Medicare choice, tax & spending cuts. (May 2011)");
        healthCare.add("Opposes government-run healthcare. (Aug 2010)");
        healthCare.add("Defund, repeal, & replace federal care with free market. (Jul 2010)");
        healthCare.add("Repeal any federal health care takeover. (Jul 2010)");



        List<String> immigration = new ArrayList<>();
        immigration.add("Legal status for 11 million illegals after we secure border. (Apr 2015)");
        immigration.add("Protect AGAINST feds creating a national ID card. (Apr 2015)");
        immigration.add("Status quo is untenable; we must do some sort of reform. (Jun 2014)");
        immigration.add("Move beyond amnesty, but eventually to path to citizenship. (Jun 2014)");
        immigration.add("Illegals are not bad people, but we have to control border. (Apr 2014)");
        immigration.add("Latinos support GOP stances of faith and family values. (Jun 2013)");
        immigration.add("Legal status, but not citizenship, for illegal immigrants. (Mar 2013)");
        immigration.add("We will find a place for illegal immigrants in America. (Mar 2013)");
        immigration.add("Replace de facto amnesty with bipartisan reform. (Mar 2013)");
        immigration.add("See immigrants as assets, not liabilities. (Feb 2013)");
        immigration.add("Obamacare treats illegal aliens because it's illegal to ask. (Oct 2010)");
        immigration.add("No amnesty; respect the law. (Jul 2010)");



        List<String> jobs = new ArrayList<>();
        jobs.add("Help the unemployed by lowering taxes dramatically. (Mar 2014)");
        jobs.add("Unemployment insurance ok if fully paid for & short-term. (Jan 2014)");
        jobs.add("Extending unemployment benefits does disservice to workers. (Dec 2013)");
        jobs.add("National Right-to-Work Act: no forced unionization. (Feb 2013)");



        List<String> socialSecurity = new ArrayList<>();
        socialSecurity.add("Raise retirement age to save program for younger generation. (Apr 2015)");
        socialSecurity.add("Raise the retirement age to deal with Baby Boomers. (Feb 2011)");
        socialSecurity.add("Raise retirement age gradually; allow opting out. (Feb 2011)");
        socialSecurity.add("I've never challenged constitutionality of Social Security. (Oct 2010)");
        socialSecurity.add("Raise the retirement age for people under age 55. (Oct 2010)");
        socialSecurity.add("Social Security is a Ponzi scheme. (Aug 2010)");
        socialSecurity.add("Supports private retirement accounts. (Aug 2010)");
        socialSecurity.add("Rated 17% by ARA, indicating a mixed record on senior issues. (Jan 2013)");



        List<String> tax = new ArrayList<>();
        tax.add("EZ Tax: $700B tax cut via 17% flat tax. (Apr 2015)");
        tax.add("Balanced budget and a simple, fair tax system. (Feb 2015)");
        tax.add("Economic growth comes when we lower taxes for everyone. (Jan 2014)");
        tax.add("Stand firm and say NO to any MORE tax hikes!. (Feb 2013)");
        tax.add("Opposed to increasing taxes during recession. (Feb 2011)");
        tax.add("Joe Taxpayer gets stuck with the bill for budget deficit. (Feb 2011)");
        tax.add("Balanced budget amendment to pay to extend $4T Bush tax cuts. (Oct 2010)");
        tax.add("Lower taxes encourage spending, saving, and investing. (Jul 2010)");
        tax.add("Taxpayer Protection Pledge: no new taxes. (Aug 2010)");
        tax.add("Supports flat-rate federal tax; opposes increased tax rates. (Aug 2010)");
        tax.add("Adopt a single-rate tax system. (Jul 2010)");
        tax.add("Repeal tax hikes in capital gains and death tax. (Jul 2010)");
        tax.add("Supports the Taxpayer Protection Pledge. (Jan 2012)");



        List<String> technology = new ArrayList<>();
        technology.add("Oppose net neutrality; Silicon Valley has no uniform support. (Nov 2014)");
        technology.add("Bridgegate is unsettling; government should not bully people. (Feb 2014)");
        technology.add("5% tax on overseas profits & put it all into infrastructure. (Jan 2014)");
        technology.add("Generalized warrants for all cellphones is unconstitutional. (Jan 2014)");
        technology.add("Snowden revealed NSA abuses, but a fair prison term is ok. (Jan 2014)");
        technology.add("4th Amendment bans NSA from collecting everyone's phone data. (Dec 2013)");
        technology.add("I don't mind spying on terrorists, but not on all Americans. (Jul 2013)");
        technology.add("FactCheck: Free 'Obama phones' actually started in 1984. (Feb 2013)");
        technology.add("Sharply questioned ban on incandescent light bulbs. (Sep 2012)");
        technology.add("TSA is a testament to Islamic terrorist's success. (Sep 2012)");
        technology.add("TSA's primary function violates the Fourth Amendment. (Sep 2012)");
        technology.add("Filibuster against SOPA and PIPA: don't censor the Internet. (Jan 2012)");
        technology.add("Voted NO on authorizing states to collect Internet sales taxes. (May 2013)");



        List<String> war = new ArrayList<>();
        war.add("Negotiate with Iran, but from a position of strength. (Aug 2015)");
        war.add("Keep on mind on Iran nukes but don't trust the ayatollahs. (Apr 2015)");
        war.add("Oppose bombing Assad in Syria because it strengthens ISIS. (Apr 2015)");
        war.add("Create & arm a Kurdish state as support against ISIL. (Apr 2015)");
        war.add("War only when all other measures are exhausted. (Apr 2015)");
        war.add("Hillary's War: Ousting Gadhafi in Libya gave rise to ISIS. (Feb 2015)");
        war.add("Supporting rebels in Syrian Civil War gave rise to ISIS. (Feb 2015)");
        war.add("Arming Syrian rebels wades into another civil war. (Sep 2014)");
        war.add("GOP is too eager for war; and so is Hillary. (Aug 2014)");
        war.add("Assist Iraqi government against ISIS, but not Syrian rebels. (Jul 2014)");
        war.add("No US troops in Iraq, even against ISIS. (Jul 2014)");
        war.add("How many Americans should die to defend Iraq? (Jul 2014)");
        war.add("ISIS are nasty terrorists but no clear-cut American interest. (Jun 2014)");
        war.add("Iraq War gave Iran regional hegemony & caused Mideast chaos. (Jun 2014)");
        war.add("Maintain ambiguous policy on containing nuclear Iran. (Apr 2014)");
        war.add("Keep all options on the table, but don't declare war on Iran. (Apr 2014)");
        war.add("Don't get stuck in Cold War idea of tweaking Russia. (Mar 2014)");
        war.add("Executive Branch can initiating war is a usurpation of power. (Mar 2014)");
        war.add("No involvement in Syria, even if gas attack proven. (Sep 2013)");
        war.add("No US interests in either side of Syrian war. (Sep 2013)");
        war.add("No US weapons to kill Christians in Syria. (Aug 2013)");
        war.add("It is unacceptable not to hate war. (Sep 2012)");
        war.add("Staying in Afghanistan will not make America safer. (Jul 2011)");
        war.add("Opposed to Iraq War; no direct threat & no declared war. (Feb 2011)");
        war.add("Would have voted against a declaration of war against Iraq. (Feb 2010)");



        List<String> welfare = new ArrayList<>();
        welfare.add("Federal 'gifts' don't generate wealth but perpetuate poverty. (Jan 2015)");
        welfare.add("Be aware of those who are missing out on American Dream. (Jan 2015)");
        welfare.add("Tax cuts help the poor because local businesses will hire. (Apr 2014)");
        welfare.add("Strong safety net, but one that doesn't suffocate us. (Jan 2014)");
        welfare.add("Economic freedom zones: low taxes in high unemployment areas. (Jan 2014)");
        welfare.add("Economic freedom zones in depressed inner cities. (Dec 2013)");
        welfare.add("Poverty line is $11,490, but welfare adds $25,000. (Oct 2013)");
        welfare.add("Block grant welfare to states and communities. (Oct 2013)");




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
