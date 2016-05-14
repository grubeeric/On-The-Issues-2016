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

public class MarcoRubio extends AppCompatActivity {
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
        setContentView(R.layout.activity_marco_rubio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvMarco);

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
        abortion.add("Barbarians of our age have murdered millions of the unborn. (Aug 2015)");
        abortion.add("Ban abortion after 20 weeks. (Apr 2015)");
        abortion.add("Consensus that life begins at conception; so no abortion. (May 2014)");
        abortion.add("I believe in protecting life but I'm not a chauvinist. (Mar 2013)");
        abortion.add("Pro-life, but understands that woman's right is the law. (Jun 2012)");
        abortion.add("Expand birth control exemption for faith-based organizations. (Jun 2012)");
        abortion.add("Opposed Sotomayor nomination based on her Roe support. (Jun 2012)");
        abortion.add("No right to privacy, that resulted in the Roe v. Wade. (Feb 2010)");
        abortion.add("Require ultrasounds before performing abortions. (Feb 2010)");
        abortion.add("Voted against funding stem cell research. (Apr 2006)");
        abortion.add("Opposes both federal abortion funding & judicial activism. (Aug 2010)");
        abortion.add("Supports prohibiting human embryonic stem cell research. (Aug 2010)");
        abortion.add("Supports giving legal protection to unborn children. (Sep 2010)");
        abortion.add("Prohibit federal funding for abortion. (May 2011)");



        List<String> economy = new ArrayList<>();
        economy.add("Repeal and replace Dodd-Frank: it eviscerates banks. (Aug 2015)");
        economy.add("Freeze spending for everything but defense at 2008 levels. (Apr 2015)");
        economy.add("Tax, borrow, & spend is not the way out of the recession. (Feb 2013)");
        economy.add("Real problem is $1T deficit each year since 2009. (Feb 2013)");
        economy.add("Oppose Obama stimulus package; it's bad for America. (Mar 2010)");
        economy.add("Support balanced budget amendment and line-item veto. (Feb 2010)");
        economy.add("Demand a Balanced Budget amendment. (Jul 2010)");
        economy.add("Limit federal spending growth to per-capita inflation rate. (Jul 2010)");
        economy.add("Supports the Cut-Cap-and-Balance Pledge. (Jan 2012)");
        economy.add("Disapprove of increasing the debt limit. (Jan 2012)");
        economy.add("Audit the Federal Reserve & its actions on mortgage loans. (Feb 2013)");



        List<String> civilRights = new ArrayList<>();
        civilRights.add("One-man-one-woman marriage existed before our laws. (Apr 2015)");
        civilRights.add("I oppose gay marriage, but it's the law of the land. (Apr 2015)");
        civilRights.add("Opposes Paycheck Fairness: don't require equal pay for women. (Apr 2014)");
        civilRights.add("Balance gay anti-discrimination with religious rights. (Mar 2014)");
        civilRights.add("Defining marriage does not demean a class of people. (Jun 2013)");
        civilRights.add("I believe in historical marriage, but ok if states redefine. (Jun 2013)");
        civilRights.add("Leave gay marriage to states, but keep DOMA. (Mar 2013)");
        civilRights.add("Voted NO on reauthorizing the Violence Against Women Act. (Feb 2013)");
        civilRights.add("Supports Amendment to prevent same sex marriage. (Aug 2010)");
        civilRights.add("Opposes Employment Non-Discrimination Act (ENDA). (Sep 2010)");



        List<String> corporations = new ArrayList<>();
        corporations.add("Big companies influence government; small businesses can't. (Aug 2015)");
        corporations.add("Cut corporate tax rate to 25%. (Apr 2015)");
        corporations.add("The banks caused the mortgage crisis and we bailed them out. (Mar 2013)");
        corporations.add("Lower corporate tax rate; it's the highest in the world. (Feb 2013)");
        corporations.add("Accused of rigging bidding process for Turnpike concessions. (Jun 2012)");
        corporations.add("End double-taxes: capital gains; dividends; & inheritance. (Jun 2012)");
        corporations.add("Antigambling, based on seeing 'another side' as kid in Vegas. (Jun 2012)");
        corporations.add("2004: Pushed $60M tax subsidy for Marlins baseball stadium. (Jun 2012)");
        corporations.add("Accused of sweetheart deal: $200K profit on sale of house. (Jun 2012)");
        corporations.add("AGREE Act: small business write-offs for capital purchases. (Jun 2012)");
        corporations.add("Most countries choose to have government run the economy. (Jan 2012)");
        corporations.add("Businesses need certainty to commit to hiring new workers. (Oct 2010)");
        corporations.add("Work across the aisle to make America more business-friendly. (Mar 2010)");
        corporations.add("Eliminate taxes on capital gains; lower corporate tax rates. (Feb 2010)");
        corporations.add("Loser pays, to discourage frivolous lawsuits. (Nov 2006)");
        corporations.add("Rated 14% by UFCW, indicating a pro-management voting record. (May 2012)");



        List<String> crime = new ArrayList<>();
        crime.add("False choice between rampant crime vs. overstretched prisons. (Apr 2015)");
        crime.add("2000: Established West Miami's 1st bicycle patrol officers. (Jun 2012)");
        crime.add("25 years ago, sister's husband made many mistakes. (Jun 2012)");
        crime.add("Toughen laws against prostitution & sex trafficking. (Apr 2007)");
        crime.add("Collect DNA of those convicted of sexually deviant behavior. (Nov 2006)");
        crime.add("Mandatory life sentence for repeat sex offenders. (Nov 2006)");
        crime.add("Endless death row appeals hinder justice. (Nov 2006)");



        List<String> drugs = new ArrayList<>();
        drugs.add("No responsible way to recreationally use marijuana. (May 2015)");
        drugs.add("Legalizing would be a mistake; reduce sentences carefully. (Apr 2015)");
        drugs.add("There is no responsible way to recreationally use marijuana. (May 2014)");
        drugs.add("Enforce federal laws even where states have legalized pot. (May 2014)");
        drugs.add("Enforce federal law even in states with legal pot. (May 2014)");
        drugs.add("1987: Brother-in-law imprisoned for drug conviction. (Jun 2012)");
        drugs.add("1986 brother-in-law's drug bust unexamined until 2011. (Jun 2012)");
        drugs.add("Brother-in-law's trial prosecuted by House member's spouse. (Jun 2012)");
        drugs.add("Teach students skills to avoid gangs, violence, & drugs. (Nov 2006)");



        List<String> education = new ArrayList<>();
        education.add("Common Core will convert from suggestions to mandate. (Aug 2015)");
        education.add("Too many 4-year college grads; focus on vocational careers. (Apr 2015)");
        education.add("Private lenders get percentage of student's income. (Feb 2015)");
        education.add("Professor of political science at Florida International U. (Feb 2015)");
        education.add("Outdated educational systems must be updated to meet needs. (Jan 2015)");
        education.add("The poor benefit most from parental choice in education. (Jan 2015)");
        education.add("Turn over Head Start to states. (Jan 2014)");
        education.add("Give parents chance to send kids to school of their choice. (Feb 2013)");
        education.add("Give info to students on costs & benefits of student loans. (Feb 2013)");
        education.add("Became serious college student after football injury. (Jun 2012)");
        education.add("1999: Pushed for early education for at-risk children. (Jun 2012)");
        education.add("Silent on voluntary school prayer. (Jun 2012)");
        education.add("Presided over $2.3B cut to Florida public education. (Jun 2012)");
        education.add("Supports No-Child-Left-Behind Opportunity Scholarships. (Nov 2010)");
        education.add("Supports No Child Left Behind Opportunity Scholarships. (Nov 2010)");
        education.add("Voted for more scholarships for private schools. (Apr 2007)");
        education.add("Incentivize foreign language curriculum in elementary school. (Nov 2006)");
        education.add("Prepare students for the Global Marketplace. (Nov 2006)");
        education.add("More options for student and parent choice in education. (Nov 2006)");
        education.add("Integrate competition principles into education marketplace. (Nov 2006)");
        education.add("A+ Plan for Education: charters and choice. (Nov 2006)");
        education.add("2+2 System: AA degree guarantees admission to university. (Nov 2006)");
        education.add("$4,500 voucher saves state $10,000 in per-student cost. (Nov 2006)");
        education.add("Private partnerships for provision of school services. (Nov 2006)");
        education.add("Supports less federal & more local control of education. (Sep 2010)");



        List<String> energy = new ArrayList<>();
        energy.add("Climate is always changing; it's not from human activity. (May 2014)");
        energy.add("Human activity is not causing climate change. (May 2014)");
        energy.add("Our government can't control the weather. (Feb 2013)");
        energy.add("Grow our energy industry, not 'clean energy' like Solyndra. (Feb 2013)");
        energy.add("I dislike cap-&-trade, but it is inevitable as national law. (Jun 2012)");
        energy.add("Cap-and-trade scheme destroys jobs. (Feb 2010)");
        energy.add("Explore ANWR & outer continental shelf. (Feb 2010)");
        energy.add("Tax incentives for energy-efficient appliances. (Nov 2006)");
        energy.add("Loans to public institutions for energy efficiency. (Nov 2006)");
        energy.add("Florida has obvious advantages in solar energy. (Nov 2006)");
        energy.add("Let hybrid drivers use HOV lanes & discount parking. (Nov 2006)");
        energy.add("Voted YES on barring EPA from regulating greenhouse gases. (Apr 2011)");
        energy.add("Signed the No Climate Tax Pledge by AFP. (Nov 2010)");
        energy.add("Cap-and-trade has no impact on global temperatures. (Jul 2010)");
        energy.add("Explore proven energy reserves & keep energy prices low. (Jul 2010)");
        energy.add("Opposes passage of Cap-and-Trade energy legislation. (Sep 2010)");
        energy.add("Let states lease energy rights on federal lands. (Jun 2013)");



        List<String> enviornment = new ArrayList<>();
        enviornment.add("Fix environment with free market, not government mandates. (Feb 2014)");
        enviornment.add("State-run insurance carriers mean more taxpayer subsidies. (Jun 2012)");
        enviornment.add("Partner with private companies for transportation system. (Nov 2006)");
        enviornment.add("Hurricane Savings Accounts for homeowners' insurance. (Nov 2006)");
        enviornment.add("Utilize toll revenues to widen & improve expressways. (Nov 2006)");
        enviornment.add("Increase funding for making homes hurricane-resistant. (Nov 2006)");
        enviornment.add("Voted NO on protecting ocean, coastal, and Great Lakes ecosystems. (May 2013)");
        enviornment.add("Rated 20% by HSLF, indicating an anti-animal welfare voting record. (Jan 2012)");
        enviornment.add("No EPA permits required for forest road runoff. (Jul 2013)");



        List<String> foreignPolicy = new ArrayList<>();
        foreignPolicy.add("We've neglected Latin American democracies & our alliances. (Apr 2015)");
        foreignPolicy.add("I have a clear strategic vision of America's role in world. (Feb 2015)");
        foreignPolicy.add("Obama has no ISIS policy to avoid upsetting Iran. (Feb 2015)");
        foreignPolicy.add("North Korea is a criminal syndicate, not a government. (Dec 2014)");
        foreignPolicy.add("Our policy should lead to more liberty for the Cuban people. (Dec 2014)");
        foreignPolicy.add("Cuba must improve on human rights for engagement to continue. (Dec 2014)");
        foreignPolicy.add("Engagement with Vietnam & China has not led to freedom. (Dec 2014)");
        foreignPolicy.add("Cuba embargo was designed to protect American companies. (Dec 2014)");
        foreignPolicy.add("Provide more assistance to Jordan, to prepare against ISIS. (Jun 2014)");
        foreignPolicy.add("Stay involved against ISIS or Iran becomes regional hegemon. (Jun 2014)");
        foreignPolicy.add("Press freedom is a universal human right, especially in Cuba. (May 2014)");
        foreignPolicy.add("Tough sanctions against Russia for Ukraine aggression. (May 2014)");
        foreignPolicy.add("Only America can stand up to world totalitarianism. (Mar 2014)");
        foreignPolicy.add("Putin wants to reconstitute Russian power & Russian prestige. (Mar 2014)");
        foreignPolicy.add("The Russian government is a government of liars. (Mar 2014)");
        foreignPolicy.add("The China Dream is to surpass America as world leader. (Mar 2013)");
        foreignPolicy.add("Build relations with Mexico for trade & oil, not just border. (Nov 2012)");
        foreignPolicy.add("Che Guevara reviled by Cuban exiles; I want no association. (Jun 2012)");
        foreignPolicy.add("America is exceptional: nation blessed by God with resources. (Jun 2012)");
        foreignPolicy.add("Prefer coalitions but don't over-rely on global institutions. (Apr 2012)");
        foreignPolicy.add("America needs a foreign policy of engaging abroad. (Apr 2012)");
        foreignPolicy.add("Military action should be on the table in Iran & Syria. (Apr 2012)");
        foreignPolicy.add("Intervention to promote democracy abroad. (Nov 2011)");
        foreignPolicy.add("Promote democracy via engagement abroad. (Sep 2011)");
        foreignPolicy.add("Foreign aid spreads positive influence around the world. (Sep 2011)");
        foreignPolicy.add("Rated -2 by AAI, indicating a anti-Arab anti-Palestine voting record. (May 2012)");
        foreignPolicy.add("Vigorous support for State of Israel against Hamas in Gaza. (Nov 2012)");
        foreignPolicy.add("Sponsored funding and supplying the Syrian rebels. (Mar 2013)");



        List<String> trade = new ArrayList<>();
        trade.add("Develop policies that embrace reality of globalization. (Jan 2015)");
        trade.add("Trade with Cuba won't translate into political freedom. (Dec 2014)");
        trade.add("Continue reducing barriers to free and fair trade. (Aug 2010)");



        List<String> guns = new ArrayList<>();
        guns.add("New gun laws are ineffective, so don't pass them. (Apr 2013)");
        guns.add("Has a concealed weapon permit, but does not carry a weapon. (Apr 2013)");
        guns.add("Deal with gun violence, but do it constitutionally. (Feb 2013)");
        guns.add("As Speaker, failed to push law allowing guns at work. (Jun 2012)");
        guns.add("2nd Amendment is a cornerstone of our democracy. (Feb 2010)");
        guns.add("Voted NO on banning high-capacity magazines of over 10 bullets. (Apr 2013)");
        guns.add("Opposes restrictions on the right to bear arms. (Aug 2010)");
        guns.add("Rated B+ by the NRA, indicating a pro-gun rights voting record. (Aug 2010)");
        guns.add("Oppose the United Nations' Arms Trade Treaty. (Sep 2013)");



        List<String> healthCare = new ArrayList<>();
        healthCare.add("All kids should get vaccinated, with medical exceptions. (Feb 2015)");
        healthCare.add("ObamaCare stifles entrepreneurship with regulation. (Jan 2015)");
        healthCare.add("World Health Organization can't combat Ebola; only US can. (Oct 2014)");
        healthCare.add("Ban visas from Ebola-stricken countries; target the source. (Oct 2014)");
        healthCare.add("Medicaid expansion fails because funded only for a few years. (Jan 2014)");
        healthCare.add("FactCheck: ObamaCare is not now forcing loss of insurance. (Feb 2013)");
        healthCare.add("Expand mental health centers; address violence at its source. (Feb 2013)");
        healthCare.add("Address mental illness with care, attention and compassion. (Feb 2013)");
        healthCare.add("Backed out of Race for the Cure over abortion funding fight. (Sep 2012)");
        healthCare.add("Medicare's hospice care let my father die with dignity. (Jun 2012)");
        healthCare.add("Expand prescription benefits to low-income seniors. (Jun 2012)");
        healthCare.add("Provide alternatives to employer-based insurance system. (Mar 2010)");
        healthCare.add("Launch a marketplace of affordable health insurance. (Nov 2006)");
        healthCare.add("Capitated managed-care systems achieve better value. (Nov 2006)");
        healthCare.add("Voted YES on the Ryan Budget: Medicare choice, tax & spending cuts. (May 2011)");
        healthCare.add("Opposes government-run healthcare. (Aug 2010)");
        healthCare.add("Defund, repeal, & replace federal care with free market. (Jul 2010)");
        healthCare.add("Repeal any federal health care takeover. (Jul 2010)");



        List<String> immigration = new ArrayList<>();
        immigration.add("Legal immigrants have been waiting in line for 15 years. (Aug 2015)");
        immigration.add("Joined 'Gang of Eight' to push comprehensive reform. (Apr 2015)");
        immigration.add("Deal with border & future immigrants BEFORE any amnesty. (Feb 2015)");
        immigration.add("2010: Earned path to citizenship is code for amnesty. (Feb 2015)");
        immigration.add("Modernize immigration to win global competition for talent. (Sep 2014)");
        immigration.add("Human trafficking law & deferred action caused border crisis. (Aug 2014)");
        immigration.add("FactCheck: No MarcoPhones, and no executive DREAMers either. (Apr 2014)");
        immigration.add("Give kids of illegal immigrants in-state tuition rates. (Jan 2014)");
        immigration.add("Border control: 90% apprehension and 100% surveillance. (Apr 2013)");
        immigration.add("Not amnesty: 15-year wait, plus fee, minus federal benefits. (Apr 2013)");
        immigration.add("Green cards after 10 years; secure border; & e-Verify. (Apr 2013)");
        immigration.add("Compare reform to existing situation of 11 million illegals. (Apr 2013)");
        immigration.add("Immigration is a human issue AND a law & order issue. (Mar 2013)");
        immigration.add("Leave immigration to feds; 50 sets of laws is worse. (Jun 2012)");
        immigration.add("English is de facto official language; let's recognize that. (Jun 2012)");
        immigration.add("AZ anti-immigrant law demands papers like 'police state'. (Jun 2012)");
        immigration.add("OpEd: Claimed falsely that parents fled Castro in 1959. (Jun 2012)");
        immigration.add("Legal status, but not citizenship, to migrant's children. (Jun 2012)");
        immigration.add("GOP DREAM Act: visas for going to college or military. (Apr 2012)");
        immigration.add("AZ law may unreasonably single out some citizens. (Apr 2010)");
        immigration.add("Don't count illegal immigrants in the 2010 census. (Apr 2010)");
        immigration.add("Allow children of illegals to pay in-state college tuition. (Mar 2010)");
        immigration.add("No amnesty in any form, not even back-of-the-line. (Mar 2010)");
        immigration.add("Oppose amnesty in any reform. (Feb 2010)");
        immigration.add("Opposes granting amnesty to illegal immigrants. (Sep 2010)");
        immigration.add("Supports full implementation of current border security laws. (Sep 2010)");



        List<String> jobs = new ArrayList<>();
        jobs.add("Give wage subsidies rather than raise minimum wage. (Jan 2015)");
        jobs.add("Voted against Paycheck Fairness Act (equal pay for women). (Sep 2014)");
        jobs.add("Ok to extend unemployment if it's paid for. (Jan 2014)");
        jobs.add("Grow the middle class; don't grow the government. (Feb 2013)");
        jobs.add("1984: Enthusiastic union activist during dad's strike. (Jun 2012)");
        jobs.add("Oppose card check & Employee Free Choice Act. (Feb 2010)");



        List<String> socialSecurity = new ArrayList<>();
        socialSecurity.add("Benefits have to be less generous to save Social Security. (Jun 2012)");
        socialSecurity.add("Raise retirement age for those now under 55. (Apr 2010)");
        socialSecurity.add("Tough choices include raising retirement age & reducing COLA. (Mar 2010)");
        socialSecurity.add("Hard choices for people under 40, to avoid runaway growth. (Mar 2010)");
        socialSecurity.add("Keep raising the retirement age on the table. (Mar 2010)");
        socialSecurity.add("Keep cost-of-living adjustment on the table. (Mar 2010)");
        socialSecurity.add("Rated 7% by ARA, indicating a pro-privatization stance. (Jan 2013)");



        List<String> tax = new ArrayList<>();
        tax.add("Our outdated tax code encourages outsourcing jobs. (Jan 2015)");
        tax.add("2007: Replace all property taxes by adding 2.5% to sales tax. (Feb 2014)");
        tax.add("Replace property taxes with a consumption tax. (Jun 2012)");
        tax.add("OpEd: Proposed consumption tax called 'largest tax increase'. (Jun 2012)");
        tax.add("Eliminate Florida property tax; or cap it at 1.35%. (Jun 2012)");
        tax.add("We need new taxpayers, not new taxes. (Apr 2012)");
        tax.add("No one should pay higher taxes in recession, not even top 2%. (Oct 2010)");
        tax.add("Extend Bush tax cuts, even for high earners. (Oct 2010)");
        tax.add("Address market uncertainty by making Bush cuts permanent. (Aug 2010)");
        tax.add("2000: $4 surcharge to cruise tickets to fund Marlins stadium. (Jul 2010)");
        tax.add("Proposed to replace property taxes with state sales tax. (Mar 2010)");
        tax.add("Pledged to never raise taxes as state rep. (Mar 2010)");
        tax.add("Capital gains tax is double taxation. (Feb 2010)");
        tax.add("Simplify our tax code; reduce the tax burden. (Feb 2010)");
        tax.add("Supermajority vote for any tax increases. (Nov 2006)");
        tax.add("Supports flat-rate federal tax; opposes increased tax rates. (Aug 2010)");
        tax.add("Adopt a single-rate tax system. (Jul 2010)");
        tax.add("Repeal tax hikes in capital gains and death tax. (Jul 2010)");
        tax.add("Supports the Taxpayer Protection Pledge. (Jan 2012)");



        List<String> technology = new ArrayList<>();
        technology.add("Amazon, our largest retailer, doesn't own a single store. (Aug 2015)");
        technology.add("Internet belongs in hands of our people, not our government. (Mar 2015)");
        technology.add("Net neutrality empowers bureaucrats and allows manipulation. (Mar 2015)");
        technology.add("No 'Net Neutrality': don't declare Internet a public utility. (Feb 2015)");
        technology.add("Technology is an opportunity to help people, not take jobs. (Jan 2015)");
        technology.add("Release anti-North Korea movie despite cyber-attack. (Dec 2014)");
        technology.add("Net neutrality is government regulation of the Internet. (Nov 2014)");
        technology.add("Information age has changed world; people have not changed. (Mar 2013)");
        technology.add("1st Senate candidate to pass 100,000 'likes' on Facebook. (Jun 2012)");
        technology.add("Co-sponsored PIPA to Protect IP, but withdrew his support. (Jun 2012)");
        technology.add("Invest in R&D and space exploration. (Aug 2010)");
        technology.add("E-budget website for detailed, issue-level budget. (Nov 2006)");
        technology.add("Protect against identity theft with privacy opt-in. (Nov 2006)");
        technology.add("Put budget online to allow public inspection and comment. (Nov 2006)");
        technology.add("Public-private partnerships to build & operate roadways. (Nov 2006)");
        technology.add("Increase criminal penalties for identity theft. (Nov 2006)");
        technology.add("Protect kids from sex predators on Facebook & MySpace. (Nov 2006)");
        technology.add("Voted NO on authorizing states to collect Internet sales taxes. (May 2013)");
        technology.add("Withdrew support for policing websites for copyright. (May 2011)");



        List<String> war = new ArrayList<>();
        war.add("ISIS plan: US air support for Sunni forces on the ground. (Feb 2015)");
        war.add("Confront and defeat ISIL now, or we will have to do so later. (Sep 2014)");
        war.add("Airstrikes in Syria and Iraq to target ISIL. (Sep 2014)");
        war.add("Airstrikes to topple Syrian government are counterproductive. (Sep 2014)");
        war.add("Stay involved in Iraq to fight ISIS, not for nation-building. (Jun 2014)");
        war.add("Timetable in Afghanistan emboldened Taliban to wait us out. (Jan 2014)");
        war.add("Lack of long-term US status in Iraq opens it for al Qaeda. (Jan 2014)");
        war.add("Assist Iraqi government in fighting ISIL. (Jan 2014)");
        war.add("Equip and train non-jihadist Syrians to topple Assad. (Aug 2013)");
        war.add("Syria: arm rebels last year; now just work with some. (Jun 2013)");
        war.add("New Iranian leader is more moderate but still supports nukes. (Jun 2013)");
        war.add("Goal for Korea: denuclearize the peninsula and to unify it. (Apr 2013)");
        war.add("Supports intervention in Libya & tougher sanctions on Syria. (Sep 2011)");
        war.add("2007 troop surge was the right thing to do. (Aug 2010)");
        war.add("Opposes timetable for troop withdrawal from Afghanistan. (Sep 2010)");
        war.add("Iranian nuclear weapons: prevention instead of containment. (May 2012)");
        war.add("Sponsored shutting down Iranian foreign reserves. (May 2013)");



        List<String> welfare = new ArrayList<>();
        welfare.add("EITC isn't enough for single workers who don't have kids. (Jan 2014)");
        welfare.add("Take next step in War on Poverty: provide opportunity. (Jan 2014)");
        welfare.add("Feds help deal with poverty; states can help escape it. (Jan 2014)");
        welfare.add("War on Poverty shows big-government approach fails. (Jan 2014)");
        welfare.add("Communities & churches once took care of neighbors. (Jun 2012)");
        welfare.add("Incentives to actually construct affordable housing. (Nov 2006)");
        welfare.add("Redesign child welfare to outsource foster care. (Nov 2006)");
        welfare.add("Institute tax-free zones in downtrodden inner-city areas. (Nov 2006)");




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
