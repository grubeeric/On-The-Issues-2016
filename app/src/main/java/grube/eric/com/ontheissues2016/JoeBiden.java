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

public class JoeBiden extends AppCompatActivity {
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
        setContentView(R.layout.activity_joe_biden);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvBiden);

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
        abortion.add("I accept church rule personally, but not in public life. (Oct 2012)");
        abortion.add("No church needs to provide contraception under ObamaCare. (Oct 2012)");
        abortion.add("Romney will appoint pro-life Justice; Obama will not. (Oct 2012)");
        abortion.add("Constitution does offer an inherent right to privacy. (Oct 2008)");
        abortion.add("Allow women to choose, but no federal funding. (Jul 2007)");
        abortion.add("No public funding for abortion; it imposes a view. (Apr 2007)");
        abortion.add("Supports partial-birth abortion ban, but not undoing Roe. (Apr 2007)");
        abortion.add("Accepts Catholic church view that life begins at conception. (Apr 2007)");
        abortion.add("Nominees should agree on constitutional right to privacy. (Apr 2007)");
        abortion.add("Roe v. Wade is as close to a consensus as we can get. (Oct 2008)");
        abortion.add("Voted NO on defining unborn child as eligible for SCHIP. (Mar 2008)");
        abortion.add("Voted NO on prohibiting minors crossing state lines for abortion. (Mar 2008)");
        abortion.add("Voted YES on expanding research to more embryonic stem cell lines. (Apr 2007)");
        abortion.add("Voted NO on notifying parents of minors who get out-of-state abortions. (Jul 2006)");
        abortion.add("Voted YES on $100M to reduce teen pregnancy by education & contraceptives. (Mar 2005)");
        abortion.add("Voted NO on criminal penalty for harming unborn fetus during other crime. (Mar 2004)");
        abortion.add("Voted NO on maintaining ban on Military Base Abortions. (Jun 2000)");
        abortion.add("Voted NO on banning human cloning. (Feb 1998)");
        abortion.add("Rated 36% by NARAL, indicating a mixed voting record on abortion. (Dec 2003)");
        abortion.add("Expand embryonic stem cell research. (Jun 2004)");
        abortion.add("Rated 0% by the NRLC, indicating a pro-choice stance. (Dec 2006)");
        abortion.add("Protect the reproductive rights of women. (Jan 1993)");
        abortion.add("Ensure access to and funding for contraception. (Feb 2007)");



        List<String> economy = new ArrayList<>();
        economy.add("Reduce spending by $1T; increase taxes by $600B; cut debt. (Feb 2013)");
        economy.add("Increase debt ceiling & Commission on Fiscal Responsibility. (Sep 2011)");
        economy.add("As banks become profitable, start fundamental reforms. (Sep 2011)");
        economy.add("1996: Accused of sweetheart deal on sale of personal home. (Oct 2010)");
        economy.add("Obama’s economic plan focuses on middle class. (Oct 2008)");
        economy.add("Deregulation got us into the housing crisis. (Oct 2008)");
        economy.add("Balancing budget is about priorities; GOP made wrong choices. (Dec 2007)");
        economy.add("Save Pentagon spending by getting the troops out of Iraq. (Dec 2007)");
        economy.add("More transparency for hedge funds and private equity funds. (Aug 2007)");
        economy.add("Invest in new programs by ending war & eliminating tax cuts. (Apr 2007)");
        economy.add("$90B stimulus program had only 0.4% waste. (Oct 2012)");
        economy.add("We inherited a god-awful mess; just level the playing field. (Oct 2012)");
        economy.add("TARP stuck in our throats, but it worked. (May 2010)");
        economy.add("Recovery Act is slowly making progress, but not good enough. (Feb 2010)");
        economy.add("FactCheck: McCain didn’t “lurch” from “strong” to “crisis”. (Oct 2008)");
        economy.add("Bail out Fannie & Freddie, fairly, to stabilize market. (Sep 2008)");
        economy.add("Voted NO on $40B in reduced federal overall spending. (Dec 2005)");
        economy.add("Voted NO on prioritizing national debt reduction below tax cuts. (Apr 2000)");
        economy.add("Voted YES on 1998 GOP budget. (May 1997)");
        economy.add("Voted YES on Balanced-budget constitutional amendment. (Mar 1997)");



        List<String> civilRights = new ArrayList<>();
        civilRights.add("Obama disbelieved 2012 gay-marriage support was 'accidental'. (Mar 2014)");
        civilRights.add("I supported gay marriage and got criticized for saying so. (May 2013)");
        civilRights.add("I'm 'absolutely comfortable' with same-sex marriage. (May 2012)");
        civilRights.add("1976: Opposed school busing to combat segregation. (Oct 2010)");
        civilRights.add("Inalienable rights cannot be denied by any majority. (Oct 2010)");
        civilRights.add("1987 Biden Report: Reject Bork; he'd roll back civil rights. (Nov 2009)");
        civilRights.add("No on gay marriage; yes on equal treatment. (Oct 2008)");
        civilRights.add("1968: Wilmington riots failed at conversation between races. (Jul 2007)");
        civilRights.add("Nobody asks if you’re gay in a foxhole. (Jun 2007)");
        civilRights.add("Civil unions ok; gay marriage is probably inevitable. (Apr 2007)");
        civilRights.add("1978: opposed busing except for gov’t-intended segregation. (Jul 2007)");
        civilRights.add("Voted NO on recommending Constitutional ban on flag desecration. (Jun 2006)");
        civilRights.add("Voted NO on constitutional ban of same-sex marriage. (Jun 2006)");
        civilRights.add("Voted YES on adding sexual orientation to definition of hate crimes. (Jun 2002)");
        civilRights.add("Voted YES on loosening restrictions on cell phone wiretapping. (Oct 2001)");
        civilRights.add("Voted YES on expanding hate crimes to include sexual orientation. (Jun 2000)");
        civilRights.add("Voted YES on setting aside 10% of highway funds for minorities & women. (Mar 1998)");
        civilRights.add("Voted NO on ending special funding for minority & women-owned business. (Oct 1997)");
        civilRights.add("Voted YES on prohibiting same-sex marriage. (Sep 1996)");
        civilRights.add("Voted YES on prohibiting job discrimination by sexual orientation. (Sep 1996)");
        civilRights.add("Voted NO on Amendment to prohibit flag burning. (Dec 1995)");
        civilRights.add("Voted NO on banning affirmative action hiring with federal funds. (Jul 1995)");
        civilRights.add("Rated 60% by the ACLU, indicating a mixed civil rights voting record. (Dec 2002)");
        civilRights.add("Issue a commemorative postage stamp of Rosa Parks. (Dec 2005)");
        civilRights.add("Rated 78% by the HRC, indicating a pro-gay-rights stance. (Dec 2006)");
        civilRights.add("Rated 100% by the NAACP, indicating a pro-affirmative-action stance. (Dec 2006)");
        civilRights.add("Re-introduce the Equal Rights Amendment. (Mar 2007)");



        List<String> corporations = new ArrayList<>();
        corporations.add("We bet on Detroit automakers in 2009, and we won!. (Mar 2014)");
        corporations.add("Same rules for Wall Street as for Main Street. (Oct 2012)");
        corporations.add("Auto bailout saved a million American jobs. (Sep 2012)");
        corporations.add("We bet on the auto industry; 400,000 new jobs means we won. (Mar 2012)");
        corporations.add("We’ve yielded to corporate America on trade. (Dec 2007)");
        corporations.add("OpEd: beholden to corporations because so many based in DE. (Nov 2007)");
        corporations.add("Take burden off corporations so jobs stay in US. (Jun 2007)");
        corporations.add("Voted YES on repealing tax subsidy for companies which move US jobs offshore. (Mar 2005)");
        corporations.add("Voted YES on reforming bankruptcy to include means-testing & restrictions. (Mar 2005)");
        corporations.add("Voted YES on restricting rules on personal bankruptcy. (Jul 2001)");
        corporations.add("Rated 32% by the US COC, indicating an anti-business voting record. (Dec 2003)");



        List<String> crime = new ArrayList<>();
        crime.add("Police and communities must respect each other. (Apr 2015)");
        crime.add("Community policing is expensive, but it works. (Apr 2015)");
        crime.add("1970: DE Public not receiving needed police protection. (Oct 2010)");
        crime.add("1990 crime bill: more police & tougher penalties. (Oct 2010)");
        crime.add("Supreme Court wrong to deny federalization of wife-beating. (Oct 2008)");
        crime.add("Bush is impediment to hate crimes legislation. (Dec 2007)");
        crime.add("Biden Law of 1994 created several new capital offenses. (Nov 2007)");
        crime.add("Supports sentencing guidelines to put away violent criminals. (Jul 2007)");
        crime.add("Authored the Clinton crime bill & 100,000 cops on the street. (Jul 2007)");
        crime.add("Separate juveniles from adults in jail. (Jul 2007)");
        crime.add("Voted YES on reinstating $1.15 billion funding for the COPS Program. (Mar 2007)");
        crime.add("Voted YES on $1.15 billion per year to continue the COPS program. (May 1999)");
        crime.add("Voted NO on limiting death penalty appeals. (Apr 1996)");
        crime.add("Voted NO on limiting product liability punitive damage awards. (Mar 1996)");
        crime.add("Voted NO on restricting class-action lawsuits. (Dec 1995)");
        crime.add("Voted NO on repealing federal speed limits. (Jun 1995)");
        crime.add("Voted NO on mandatory prison terms for crimes involving firearms. (May 1994)");
        crime.add("Voted NO on rejecting racial statistics in death penalty appeals. (May 1994)");
        crime.add("Rated 71% by CURE, indicating pro-rehabilitation crime votes. (Dec 2000)");
        crime.add("More funding and stricter sentencing for hate crimes. (Apr 2001)");
        crime.add("Establish a domestic violence volunteer attorney network. (May 2007)");
        crime.add("Increase funding for 'COPS ON THE BEAT' program. (Jan 2007)");
        crime.add("Reduce recidivism by giving offenders a Second Chance. (Mar 2007)");
        crime.add("Establish an FBI registry of sexual offendors. (Oct 1996)");



        List<String> drugs = new ArrayList<>();
        drugs.add("OpEd: Executive privilege doesn't apply to 'Fast & Furious'. (Jun 2012)");
        drugs.add("Marijuana is a gateway drug; legalization is a mistake. (Dec 2010)");
        drugs.add("1988: Crafted new law creating national Drug Czar. (Oct 2010)");
        drugs.add("1990 crime bill: tougher penalties for drug offenders. (Oct 2010)");
        drugs.add("Took lead on drug policy & narcotics control. (Nov 2007)");
        drugs.add("National ban on smoking would reduce chronic illnesses. (Sep 2007)");
        drugs.add("Absolutely do not lower drinking age from 21. (Sep 2007)");
        drugs.add("FactCheck: 40,000 babies with alcohol syndrome, not 300,000. (Sep 2007)");
        drugs.add("Increase penalties for dealing drugs near schools. (Sep 2007)");
        drugs.add("Most violent crime is related to drugs. (Jul 2007)");
        drugs.add("Divert drug offenders out of prison system. (Jun 2007)");
        drugs.add("Created nation’s Drug Czar Office & drug courts. (Dec 2006)");
        drugs.add("Voted NO on increasing penalties for drug offenses. (Nov 1999)");
        drugs.add("Voted YES on spending international development funds on drug control. (Jul 1996)");
        drugs.add("Rename 'Drug Abuse' institute as 'Diseases of Addiction'. (Mar 2007)");
        drugs.add("End harsher sentencing for crack vs. powder cocaine. (Jun 2007)");
        drugs.add("Enhance interdiction by criminalizing unflagged submarines. (Jul 2008)");



        List<String> education = new ArrayList<>();
        education.add("$500M for businesses partnerships at community colleges. (Feb 2012)");
        education.add("$500M for Race to the Top's Early Learning Challenges. (May 2011)");
        education.add("No Child Left Behind was left behind. (Oct 2008)");
        education.add("Hire more teachers and pay them for smaller classes. (Dec 2007)");
        education.add("Laid out a $30 billion plan over five years for education. (Nov 2007)");
        education.add("For longer school day & school year, & 16-year minimum. (Oct 2007)");
        education.add("$3000 tax credit for college for anyone earning under $150K. (Sep 2007)");
        education.add("There needs to be performance-based pay for teachers. (Aug 2007)");
        education.add("Teach sex ed in schools; including prevention methods. (Aug 2007)");
        education.add("Sent kids to private school after death of their mother. (Jul 2007)");
        education.add("Overcome racial achievement gap with early education. (Jun 2007)");
        education.add("Pay teachers more to get better educational results. (Apr 2007)");
        education.add("FactCheck: Japan pays teachers more, but not India & China. (Apr 2007)");
        education.add("NCLB needs more resources, but also is fundamentally flawed. (Feb 2007)");
        education.add("Princeton was last Ivy holdout to admit women & minorities. (Jan 2006)");
        education.add("Voting for No Child Left Behind was a mistake. (Jul 2007)");
        education.add("Voted YES on $52M for '21st century community learning centers'. (Oct 2005)");
        education.add("Voted YES on $5B for grants to local educational agencies. (Oct 2005)");
        education.add("Voted YES on shifting $11B from corporate tax loopholes to education. (Mar 2005)");
        education.add("Voted YES on funding smaller classes instead of private tutors. (May 2001)");
        education.add("Voted YES on funding student testing instead of private tutors. (May 2001)");
        education.add("Voted YES on spending $448B of tax cut on education & debt reduction. (Apr 2001)");
        education.add("Voted YES on Educational Savings Accounts. (Mar 2000)");
        education.add("Voted YES on education savings accounts. (Jun 1998)");
        education.add("Voted NO on school vouchers in DC. (Sep 1997)");
        education.add("Voted YES on $75M for abstinence education. (Jul 1996)");
        education.add("Voted NO on requiring schools to allow voluntary prayer. (Jul 1994)");
        education.add("Voted YES on national education standards. (Feb 1994)");
        education.add("Rated 91% by the NEA, indicating pro-public education votes. (Dec 2003)");



        List<String> energy = new ArrayList<>();
        energy.add("Pushed cap-and-trade early; but $90B tax credits passed. (May 2013)");
        energy.add("Switch China from coal to gas, instead of carbon tax. (May 2013)");
        energy.add("Set out vision for young people to deal with global warming. (Feb 2013)");
        energy.add("Unprecedented investment in renewable energy. (Feb 2012)");
        energy.add("I have supported clean coal for 25 years. (Oct 2008)");
        energy.add("Cause of global warming is clearly Man-made. (Oct 2008)");
        energy.add("Obama believes in investing in alternative energy. (Oct 2008)");
        energy.add("Nuclear OK after dealing with security, safety, and waste. (Aug 2008)");
        energy.add("The energy challenge take sacrifice and is a moral crusade. (Dec 2007)");
        energy.add("FactCheck: Oil did not jump $18/bbl due to Iran Resolution. (Dec 2007)");
        energy.add("Supports cap-and-trade for greenhouse gases. (Nov 2007)");
        energy.add("Provide for emergency fuel assistance immediately. (Oct 2007)");
        energy.add("Make every automobile sold be a flex-fuel automobile. (Apr 2007)");
        energy.add("1970s: Voted against the Trans-Alaska Pipeline. (Nov 2009)");
        energy.add("Voted YES on tax incentives for energy production and conservation. (Jun 2008)");
        energy.add("Voted YES on addressing CO2 emissions without considering India & China. (May 2008)");
        energy.add("Voted YES on removing oil & gas exploration subsidies. (Jun 2007)");
        energy.add("Voted YES on factoring global warming into federal project planning. (May 2007)");
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
        energy.add("Voted NO on ending discussion of CAFE fuel efficiency standards. (Sep 1999)");
        energy.add("Voted NO on defunding renewable and solar energy. (Jun 1999)");
        energy.add("Voted NO on approving a nuclear waste repository. (Apr 1997)");
        energy.add("Voted NO on do not require ethanol in gasoline. (Aug 1994)");
        energy.add("Keep efficient air conditioner rule to conserve energy. (Mar 2004)");
        energy.add("Establish greenhouse gas tradeable allowances. (Feb 2005)");
        energy.add("Sponsored bill raising CAFE by a 4% per year until 2018. (Jul 2006)");
        energy.add("Rated 83% by the CAF, indicating support for energy independence. (Dec 2006)");
        energy.add("Sign on to UN Framework Convention on Climate Change. (Jan 2007)");
        energy.add("Designate sensitive ANWR area as protected wilderness. (Nov 2007)");
        energy.add("Let states define stricter-than-federal emission standards. (Jan 2008)");



        List<String> enviornment = new ArrayList<>();
        enviornment.add("1970s: Push to prohibit refineries, to protect state beaches. (Oct 2010)");
        enviornment.add("America should guarantee Katrina reconstruction. (Jun 2007)");
        enviornment.add("Take away the billions of subsidy to the oil companies. (Jun 2007)");
        enviornment.add("Scored 80% on Humane Society Scorecard on animal protection. (Jan 2007)");
        enviornment.add("Voted YES on including oil & gas smokestacks in mercury regulations. (Sep 2005)");
        enviornment.add("Voted NO on confirming Gale Norton as Secretary of Interior. (Jan 2001)");
        enviornment.add("Voted NO on more funding for forest roads and fish habitat. (Sep 1999)");
        enviornment.add("Voted YES on transportation demo projects. (Mar 1998)");
        enviornment.add("Voted YES on reducing funds for road-building in National Forests. (Sep 1997)");
        enviornment.add("Voted YES on continuing desert protection in California. (Oct 1994)");
        enviornment.add("Voted YES on requiring EPA risk assessments. (May 1994)");
        enviornment.add("End commercial whaling and illegal trade in whale meat. (Jun 2001)");
        enviornment.add("Rated 95% by the LCV, indicating pro-environment votes. (Dec 2003)");
        enviornment.add("EPA must do better on mercury clean-up. (Apr 2004)");
        enviornment.add("Strengthen prohibitions against animal fighting. (Jan 2007)");



        List<String> foreignPolicy = new ArrayList<>();
        foreignPolicy.add("An internationalist as Foreign Relations Committee chair. (Mar 2014)");
        foreignPolicy.add("OpEd: called Cheney 'dangerous' but Biden followed his model. (Mar 2014)");
        foreignPolicy.add("Iraq's lesson: Be cautious on declaring Syrian WMDs. (May 2013)");
        foreignPolicy.add("Jewish state of Israel is only way to ensure 'Never Again'. (Mar 2013)");
        foreignPolicy.add("Arab Spring changed Mideast; commitment to Israel unchanged. (Mar 2013)");
        foreignPolicy.add("China's growth & stability depends on US Pacific presence. (Feb 2013)");
        foreignPolicy.add("Open dialogue means no military conflict with China. (Feb 2013)");
        foreignPolicy.add("Rise of peaceful, responsible China in the interests of all. (Feb 2013)");
        foreignPolicy.add("GOP too tough but not smart; Dems not tough enough. (Jun 2012)");
        foreignPolicy.add("VP role: bring experience, but not deciding voice. (Jun 2012)");
        foreignPolicy.add("US and Russia can disagree and still work together. (Mar 2011)");
        foreignPolicy.add("1986: Strict sanctions against South African apartheid. (Oct 2010)");
        foreignPolicy.add("Nation-building can prevent full-scale military actions. (Oct 2010)");
        foreignPolicy.add("1990: Predicted that Soviet Union would cease to exist. (Oct 2010)");
        foreignPolicy.add("New World Order should not mean US fights for the UN. (Oct 2010)");
        foreignPolicy.add("First VP speech: Refute Bush's unilateralist foreign policy. (Oct 2010)");
        foreignPolicy.add("Condemned 1,600 new housing units in East Jerusalem. (Oct 2010)");
        foreignPolicy.add("Time to sit down and talk, talk, talk to enemies. (Oct 2008)");
        foreignPolicy.add("Bush’s approach to middle east has been disastrous. (Oct 2008)");
        foreignPolicy.add("FactCheck: McCain did not refuse to sit down with Spain. (Oct 2008)");
        foreignPolicy.add("The US is less secure and more isolated in recent history. (Aug 2008)");
        foreignPolicy.add("Even Bush recognizes we should talk to Iran. (Aug 2008)");
        foreignPolicy.add("Doctrine of crisis prevention, not preemption. (Dec 2007)");
        foreignPolicy.add("Hold China accountable; it’s capitulation, not competition. (Dec 2007)");
        foreignPolicy.add("Move from a Musharraf policy to a Pakistan policy. (Nov 2007)");
        foreignPolicy.add("Pakistani elections will be a sham if emergency not lifted. (Nov 2007)");
        foreignPolicy.add("Pakistan is potentially most dangerous country in the world. (Aug 2007)");
        foreignPolicy.add("China holds the mortgage on our house, to pay for war. (Aug 2007)");
        foreignPolicy.add("American troops on the ground in Darfur now. (Jul 2007)");
        foreignPolicy.add("US troops on ground in Sudan to end Darfur carnage. (Jun 2007)");
        foreignPolicy.add("Biggest threat to US is from North Korea, Iran, & Russia. (Apr 2007)");
        foreignPolicy.add("1993: Strongly endorsed $1.6B Russia aid package. (Jun 2004)");
        foreignPolicy.add("Voted YES on cooperating with India as a nuclear power. (Oct 2008)");
        foreignPolicy.add("Voted YES on enlarging NATO to include Eastern Europe. (May 2002)");
        foreignPolicy.add("Voted YES on killing a bill for trade sanctions if China sells weapons. (Sep 2000)");
        foreignPolicy.add("Voted NO on capping foreign aid at only $12.7 billion. (Oct 1999)");
        foreignPolicy.add("Voted NO on limiting the President's power to impose economic sanctions. (Jul 1998)");
        foreignPolicy.add("Voted NO on limiting NATO expansion to only Poland, Hungary & Czech. (Apr 1998)");
        foreignPolicy.add("Voted YES on $17.9 billion to IMF. (Mar 1998)");
        foreignPolicy.add("Voted YES on Strengthening of the trade embargo against Cuba. (Mar 1996)");
        foreignPolicy.add("Voted YES on ending Vietnam embargo. (Jan 1994)");
        foreignPolicy.add("Multi-year commitment to Africa for food & medicine. (Apr 2001)");
        foreignPolicy.add("Impose sanctions and an import ban on Burma. (Oct 2007)");
        foreignPolicy.add("Remove African National Congress from terrorist list. (May 2008)");
        foreignPolicy.add("Implement Darfur Peace Agreement with UN peacekeeping force. (Feb 2008)");
        foreignPolicy.add("Condemns Russia for provocative statements to Georgia. (May 2008)");
        foreignPolicy.add("Acknowledge the Armenian Genocide of the early 1900s. (Mar 2007)");
        foreignPolicy.add("Urge Venezuela to re-open dissident radio & TV stations. (May 2007)");
        foreignPolicy.add("Let Ukraine & Georgia enter NATO. (Jan 2008)");
        foreignPolicy.add("Condemn violence by Chinese government in Tibet. (Apr 2008)");
        foreignPolicy.add("Sanction Mugabe until Zimbabwe transitions to democracy. (Apr 2008)");
        foreignPolicy.add("Pressure friendly Arab states to end Israeli boycott. (Oct 2007)");



        List<String> trade = new ArrayList<>();
        trade.add("Comprehensive transatlantic trade agreement is within reach. (Feb 2013)");
        trade.add("Permanent normal trade relations to Russia. (Feb 2013)");
        trade.add("Countervailing duties against unfair trade practices. (Mar 2012)");
        trade.add("Competition with China pushes for better products & policies. (Feb 2012)");
        trade.add("Built environmental and labor standards in trade agreements. (Dec 2007)");
        trade.add("Toughest choice: rationalizing competition & trade policy. (Dec 2007)");
        trade.add("Opposes fast-track to protect labor rights. (Nov 2007)");
        trade.add("Shut down any imports of toys from China. (Oct 2007)");
        trade.add("President’s job is to create jobs, not to export jobs. (Aug 2007)");
        trade.add("No trade agreements without workers’ & environmental rights. (Jul 2007)");
        trade.add("I'm a 'car guy'; I recognize importance of manufacturing. (Oct 2005)");
        trade.add("No to tariffs; just enforce the law. (Dec 2007)");
        trade.add("Voted NO on free trade agreement with Oman. (Jun 2006)");
        trade.add("Voted NO on implementing CAFTA for Central America free-trade. (Jul 2005)");
        trade.add("Voted NO on establishing free trade between US & Singapore. (Jul 2003)");
        trade.add("Voted NO on establishing free trade between the US and Chile. (Jul 2003)");
        trade.add("Voted YES on extending free trade to Andean nations. (May 2002)");
        trade.add("Voted YES on granting normal trade relations status to Vietnam. (Oct 2001)");
        trade.add("Voted YES on removing common goods from national security export rules. (Sep 2001)");
        trade.add("Voted YES on permanent normal trade relations with China. (Sep 2000)");
        trade.add("Voted YES on expanding trade to the third world. (May 2000)");
        trade.add("Voted YES on renewing 'fast track' presidential trade authority. (Nov 1997)");
        trade.add("Voted YES on imposing trade sanctions on Japan for closed market. (May 1995)");
        trade.add("Rated 42% by CATO, indicating a mixed record on trade issues. (Dec 2002)");
        trade.add("Extend trade restrictions on Burma to promote democracy. (Jun 2007)");



        List<String> guns = new ArrayList<>();
        guns.add("Public supports gun control; Congress has not caught up. (May 2013)");
        guns.add("Moral obligation to diminish senseless gun violence. (Jan 2013)");
        guns.add("Keep assault weapons ban; close gun show loophole. (Apr 2007)");
        guns.add("Voted NO on prohibiting lawsuits against gun manufacturers. (Jul 2005)");
        guns.add("Voted NO on banning lawsuits against gun manufacturers for gun violence. (Mar 2004)");
        guns.add("Voted YES on background checks at gun shows. (May 1999)");
        guns.add("Voted NO on more penalties for gun & drug violations. (May 1999)");
        guns.add("Voted NO on loosening license & background checks at gun shows. (May 1999)");
        guns.add("Voted NO on maintaining current law: guns sold without trigger locks. (Jul 1998)");
        guns.add("Rated F by the NRA, indicating a pro-gun control voting record. (Dec 2003)");



        List<String> healthCare = new ArrayList<>();
        healthCare.add("Those near doughnut hole you get $600 more for Rx benefits. (Oct 2012)");
        healthCare.add("Medicare gives seniors choice, even if Rx prices negotiated. (Oct 2012)");
        healthCare.add("ObamaCare built on the best of our private insurance system. (Mar 2011)");
        healthCare.add("Advised delaying ObamaCare while busy avoiding Depression. (May 2010)");
        healthCare.add("Insurance mandate is same debate as for Social Security. (Feb 2010)");
        healthCare.add("Modernize, simplify & expand health insurance. (Nov 2007)");
        healthCare.add("Help medical students find ways to finance their tuition. (Oct 2007)");
        healthCare.add("Start paying for universal coverage with $100B in redundancy. (Sep 2007)");
        healthCare.add("Rethink healthcare by focusing on prevention. (Sep 2007)");
        healthCare.add("Start with catastrophic insurance and insuring all kids. (Aug 2007)");
        healthCare.add("Got tested for AIDS after blood transfusion; no shame in it. (Jun 2007)");
        healthCare.add("Survived two aneurysms in the 1990s. (Oct 2005)");
        healthCare.add("McCain health plan is ultimate Bridge to Nowhere. (Oct 2008)");
        healthCare.add("Voted YES on overriding veto on expansion of Medicare. (Jul 2008)");
        healthCare.add("Voted NO on means-testing to determine Medicare Part D premium. (Mar 2008)");
        healthCare.add("Voted NO on allowing tribal Indians to opt out of federal healthcare. (Feb 2008)");
        healthCare.add("Voted YES on adding 2 to 4 million children to SCHIP eligibility. (Nov 2007)");
        healthCare.add("Voted YES on requiring negotiated Rx prices for Medicare part D. (Apr 2007)");
        healthCare.add("Voted YES on expanding enrollment period for Medicare Part D. (Feb 2006)");
        healthCare.add("Voted YES on increasing Medicaid rebate for producing generics. (Nov 2005)");
        healthCare.add("Voted YES on negotiating bulk purchases for Medicare prescription drug. (Mar 2005)");
        healthCare.add("Voted YES on $40 billion per year for limited Medicare prescription drug benefit. (Jun 2003)");
        healthCare.add("Voted YES on allowing reimportation of Rx drugs from Canada. (Jul 2002)");
        healthCare.add("Voted YES on allowing patients to sue HMOs & collect punitive damages. (Jun 2001)");
        healthCare.add("Voted NO on funding GOP version of Medicare prescription drug benefit. (Apr 2001)");
        healthCare.add("Voted YES on including prescription drugs under Medicare. (Jun 2000)");
        healthCare.add("Voted NO on limiting self-employment health deduction. (Jul 1999)");
        healthCare.add("Voted YES on increasing tobacco restrictions. (Jun 1998)");
        healthCare.add("Voted NO on Medicare means-testing. (Jun 1997)");
        healthCare.add("Voted YES on blocking medical savings acounts. (Apr 1996)");
        healthCare.add("Rated 100% by APHA, indicating a pro-public health record. (Dec 2003)");
        healthCare.add("Establish a national childhood cancer database. (Mar 2007)");



        List<String> immigration = new ArrayList<>();
        immigration.add("FactCheck: 67% of illegal aliens speak Spanish; not 40%. (Dec 2007)");
        immigration.add("H1-B visas only for jobs Americans can’t do. (Dec 2007)");
        immigration.add("Americans will do any job if you pay them properly. (Dec 2007)");
        immigration.add("Oppose granting driver’s licenses to illegal immigrants. (Nov 2007)");
        immigration.add("Supported Bush plan: both border fence & path to citizenship. (Nov 2007)");
        immigration.add("2007: Immigration reform failed because McCain absent. (Oct 2007)");
        immigration.add("Sanctuary cities exist because feds can’t enforce their laws. (Sep 2007)");
        immigration.add("It’s impractical to deport 14 million illegal immigrants. (Jun 2007)");
        immigration.add("Voted for border fence, but to tackle drug trafficking. (Jun 2007)");
        immigration.add("Voted YES on continuing federal funds for declared 'sanctuary cities'. (Mar 2008)");
        immigration.add("Voted YES on comprehensive immigration reform. (Jun 2007)");
        immigration.add("Voted NO on declaring English as the official language of the US government. (Jun 2007)");
        immigration.add("Voted YES on eliminating the 'Y' nonimmigrant guestworker program. (May 2007)");
        immigration.add("Voted YES on building a fence along the Mexican border. (Sep 2006)");
        immigration.add("Voted YES on establishing a Guest Worker program. (May 2006)");
        immigration.add("Voted YES on allowing illegal aliens to participate in Social Security. (May 2006)");
        immigration.add("Voted YES on giving Guest Workers a path to citizenship. (May 2006)");
        immigration.add("Voted YES on allowing more foreign workers into the US for farm work. (Jul 1998)");
        immigration.add("Voted NO on visas for skilled workers. (May 1998)");
        immigration.add("Voted NO on limit welfare for immigrants. (Jun 1997)");
        immigration.add("Rated 8% by USBC, indicating an open-border stance. (Dec 2006)");



        List<String> jobs = new ArrayList<>();
        jobs.add("Labor unions have built the middle class and built America. (Sep 2014)");
        jobs.add("Match ready-to-work trainees with ready-to-be-filled jobs. (Jan 2014)");
        jobs.add("We can & will get unemployment under 6%. (Oct 2012)");
        jobs.add("A job is about more than a paycheck; it's about dignity. (Sep 2012)");
        jobs.add("We value working class; Republicans value privileged class. (Mar 2012)");
        jobs.add("Extending unemployment benefits is the American way. (Dec 2010)");
        jobs.add("No job discrimination by sexual orientation. (Aug 2007)");
        jobs.add("Implement current recommendations on job safety. (Aug 2007)");
        jobs.add("FactCheck: His AFL-CIO rating of 85% is not best of all Dems. (Aug 2007)");
        jobs.add("Couldn’t afford living at minimum wage; advocates raising it. (Jul 2007)");
        jobs.add("Bush tries to strip away 100 years of labor progress. (Mar 2007)");
        jobs.add("Voted YES on overriding presidential veto of Farm Bill. (Jun 2008)");
        jobs.add("Voted NO on terminating legal challenges to English-only job rules. (Mar 2008)");
        jobs.add("Voted YES on restricting employer interference in union organizing. (Jun 2007)");
        jobs.add("Voted YES on increasing minimum wage to $7.25. (Feb 2007)");
        jobs.add("Voted YES on raising the minimum wage to $7.25 rather than $6.25. (Mar 2005)");
        jobs.add("Voted NO on repealing Clinton's ergonomic rules on repetitive stress. (Mar 2001)");
        jobs.add("Voted NO on killing an increase in the minimum wage. (Nov 1999)");
        jobs.add("Voted NO on allowing workers to choose between overtime & comp-time. (May 1997)");
        jobs.add("Voted YES on replacing farm price supports. (Feb 1996)");
        jobs.add("Protect overtime pay protections. (Jun 2003)");
        jobs.add("Rated 100% by the AFL-CIO, indicating a pro-union voting record. (Dec 2003)");
        jobs.add("Allow an Air Traffic Controller's Union. (Jan 2006)");



        List<String> socialSecurity = new ArrayList<>();
        socialSecurity.add("Where would elderly be now if funds were in stock market? (Oct 2012)");
        socialSecurity.add("Raise the $97,500 cap, but don’t raise retirement age. (Sep 2007)");
        socialSecurity.add("Prevent senior fraud by educating seniors about caution. (Nov 2002)");
        socialSecurity.add("Voted NO on Social Security Lockbox & limiting national debt. (Apr 1999)");
        socialSecurity.add("Voted YES on allowing Roth IRAs for retirees. (May 1998)");
        socialSecurity.add("Voted NO on allowing personal retirement accounts. (Apr 1998)");
        socialSecurity.add("Voted YES on deducting Social Security payments on income taxes. (May 1996)");
        socialSecurity.add("Rated 89% by the ARA, indicating a pro-senior voting record. (Dec 2003)");



        List<String> tax = new ArrayList<>();
        tax.add("Millionaires pay more; middle class pays less. (Oct 2012)");
        tax.add("Not mathematically possible to cut $5T in loopholes. (Oct 2012)");
        tax.add("Tax revenue increases must be part of budget deal. (Apr 2012)");
        tax.add("Surtax on earnings over $1 million seems fair to us. (Nov 2011)");
        tax.add("Economic inequity worsened by tax cuts for the wealthy. (Apr 2010)");
        tax.add("Middle class is U.S. economic engine and needs tax cuts. (Oct 2008)");
        tax.add("FactCheck: McCain did not vote with Obama on tax increase. (Oct 2008)");
        tax.add("Save $150 billion in tax cuts for people who don’t need them. (Dec 2007)");
        tax.add("Take away $85B in annual tax cuts for 1% of top earners. (Jul 2007)");
        tax.add("FactCheck: Top 1% only got $67B in 2007 tax cuts, not $85B. (Jul 2007)");
        tax.add("Eliminate the tax cut just for those people in the top 1%. (Mar 2007)");
        tax.add("Voted YES on increasing tax rate for people earning over $1 million. (Mar 2008)");
        tax.add("Voted NO on allowing AMT reduction without budget offset. (Mar 2008)");
        tax.add("Voted NO on raising the Death Tax exemption to $5M from $1M. (Feb 2008)");
        tax.add("Voted NO on repealing the Alternative Minimum Tax. (Mar 2007)");
        tax.add("Voted NO on raising estate tax exemption to $5 million. (Mar 2007)");
        tax.add("Voted NO on supporting permanence of estate tax cuts. (Aug 2006)");
        tax.add("Voted NO on permanently repealing the `death tax`. (Jun 2006)");
        tax.add("Voted YES on $47B for military by repealing capital gains tax cut. (Feb 2006)");
        tax.add("Voted NO on retaining reduced taxes on capital gains & dividends. (Feb 2006)");
        tax.add("Voted NO on extending the tax cuts on capital gains and dividends. (Nov 2005)");
        tax.add("Voted NO on $350 billion in tax breaks over 11 years. (May 2003)");
        tax.add("Voted YES on reducing marriage penalty instead of cutting top tax rates. (May 2001)");
        tax.add("Voted YES on increasing tax deductions for college tuition. (May 2001)");
        tax.add("Voted YES on eliminating the 'marriage penalty'. (Jul 2000)");
        tax.add("Voted NO on across-the-board spending cut. (Oct 1999)");
        tax.add("Voted NO on requiring super-majority for raising taxes. (Apr 1998)");
        tax.add("Rated 15% by NTU, indicating a 'Big Spender' on tax votes. (Dec 2003)");
        tax.add("Rated 100% by the CTJ, indicating support of progressive taxation. (Dec 2006)");



        List<String> technology = new ArrayList<>();
        technology.add("Double amount of spectrum available for wireless broadband. (Feb 2012)");
        technology.add("Internet is new public space; make it a force for democracy. (Nov 2011)");
        technology.add("No exclusive government control over Internet resources. (Nov 2011)");
        technology.add("WikiLeaks founder is a high-tech terrorist. (Dec 2010)");
        technology.add("China invests 7% of GDP in infrastructure; we invest only 1%. (Dec 2008)");
        technology.add("Proposed $980M for tunnel repair; others have dropped ball. (Aug 2007)");
        technology.add("Voted NO on restoring $550M in funding for Amtrak for 2007. (Mar 2006)");
        technology.add("Voted YES on disallowing FCC approval of larger media conglomerates. (Sep 2003)");
        technology.add("Voted YES on Internet sales tax moratorium. (Oct 1998)");
        technology.add("Voted YES on telecomm deregulation. (Feb 1996)");
        technology.add("Fund nanomaterial research project for car batteries. (Mar 2007)");
        technology.add("Overturn FCC approval of media consolidation. (Mar 2008)");



        List<String> war = new ArrayList<>();
        war.add("Out of Iraq as promised; out of Afghanistan soon. (Oct 2012)");
        war.add("Out of Afghanistan in 2014, period. (Oct 2012)");
        war.add("Drones against al Qaeda instead of ground troops. (Jun 2012)");
        war.add("Advised caution in striking Osama bin Laden. (Jan 2012)");
        war.add("Withdraw US troops continuously from Afghanistan until 2014. (Dec 2011)");
        war.add("2002: Iraq pivots from unfinished business in Afghanistan. (Oct 2010)");
        war.add("2008: Afghanistan is forgotten war, & Pakistan is neglected. (Oct 2010)");
        war.add("Enemy is Al Qaeda, not Taliban; timetable for withdrawal ok. (Oct 2010)");
        war.add("Not necessary to defeat Taliban; it's part of Afghan society. (Oct 2010)");
        war.add("We're in Afghanistan because of Al Qaeda, period. (May 2010)");
        war.add("1990 Gulf War: reason enough to send generation to war? (Jun 2012)");
        war.add("OpEd: Iraq war follows tradition of active US leadership. (Jun 2012)");
        war.add("Proud of involvement in winding down Iraq war. (Dec 2011)");
        war.add("1998: only way to remove Saddam is massive military effort. (Aug 2011)");
        war.add("OpEd: 2003 Iraq vote unmistakably authorized war. (Nov 2010)");
        war.add("No vital interest in Kuwait in 1990; like Vietnam in 1972. (Oct 2010)");
        war.add("1990: One man deciding to go to war is tyranny. (Oct 2010)");
        war.add("2009: Monthly visit to Baghdad to wind down Iraq War. (May 2010)");
        war.add("2007: Supported funding Iraq War, against Obama. (Aug 2009)");
        war.add("2002: Waiting to be sure of Saddam danger could be too late. (Oct 2008)");
        war.add("Post-colonial countries like Iraq need federal system. (Nov 2007)");
        war.add("Third way: federalize Iraq; troops home; no chaos behind. (Nov 2007)");
        war.add("Changed mind on Iraq pullout, not about political solution. (Sep 2007)");
        war.add("Worth losing election to protect our troops. (Sep 2007)");
        war.add("Leaving Iraq will cause generation-long regional war. (Aug 2007)");
        war.add("Voted for Iraq War resolution to avoid war in Iraq. (Jul 2007)");
        war.add("Bush invaded Iraq as the weakest of the Axis of Evil. (Jul 2007)");
        war.add("End neocon fantasy of remaking Iraq in our image. (Jul 2007)");
        war.add("Never de-fund a single soldier in Iraq. (Jul 2007)");
        war.add("Fund the safety of the troops till 67 anti-war votes reached. (Jun 2007)");
        war.add("Think about the decade after Iraq, not just the day after. (Apr 2007)");
        war.add("In 2002 Saddam posed a threat of purchasing a nuclear bomb. (Apr 2007)");
        war.add("US worse off than before Saddam because US lost credibility. (Apr 2007)");
        war.add("Partitioning Iraq is inevitable, as shown by history. (Apr 2007)");
        war.add("Decentralize Iraqi government; local control over daily life. (Apr 2007)");
        war.add("Biden-Gelb plan: UN & Muslim powers to enforce Iraq unity. (Apr 2007)");
        war.add("Decentralize Iraq to give people control over daily lives. (Feb 2007)");
        war.add("Prevent--not contain--Iranian nuclear weapon. (Mar 2013)");
        war.add("Syria's Assad must go, but carefully vet who gets aid. (Mar 2013)");
        war.add("Intel support against extremism in Mali and North Africa. (Feb 2013)");
        war.add("Iran Sanctions are most crippling in history. (Oct 2012)");
        war.add("Iran is not close to nuclear weapons; stop the bluster. (Oct 2012)");
        war.add("Syria not like Libya; intervention would ignite the region. (Oct 2012)");
        war.add("Opposed Vietnam but didn't identify with anti-war movement. (Jun 2012)");
        war.add("1990s: Military intervention to stop Bosnia ethnic cleansing. (Jun 2012)");
        war.add("Syrian brutality must end; Assad must step down. (Dec 2011)");
        war.add("We shared responsibility to bring democracy to Libya. (Dec 2011)");
        war.add("Iran is isolated, and will be more so when Syria falls. (Dec 2011)");
        war.add("1992: lift Bosnian arms embargo; NATO air strikes on Serbs. (Oct 2010)");
        war.add("9/11: Urged Bush to stay in public, like DeGaulle in WWII. (Oct 2010)");
        war.add("1971: Campaigned on wanting Vietnam War over. (Oct 2010)");
        war.add("My push for Bosnian intervention saved 1000s of lives. (Oct 2008)");
        war.add("Accept NIE conclusion that Iran stopped nukes in 2003. (Dec 2007)");
        war.add("Muslims don’t like us because they do not trust us. (Dec 2007)");
        war.add("Strong US intervention in trouble spots around the world. (Nov 2007)");
        war.add("A military action resolution on Iran is a bad policy. (Oct 2007)");
        war.add("It’s already US policy to go into Pakistan to get al Qaeda. (Aug 2007)");
        war.add("1995: pushed to lift arms embargo in Bosnia. (Jul 2007)");
        war.add("1995: pushed Clinton to bomb Serbia to free Kosovo. (Jul 2007)");
        war.add("Do away with the policy of regime change for Iran. (Jun 2007)");
        war.add("Replace pre-emption doctrine with prevention. (Apr 2007)");
        war.add("Regrets his war vote because Bush misused war authority. (Apr 2007)");
        war.add("Vote for war allowed war only after all else failed. (Apr 2007)");
        war.add("Introduced legislation barring US Military bases in Iraq. (Apr 2007)");
        war.add("Vote for Iraq War was mistake; assumed Bush competence. (Feb 2007)");
        war.add("Voted for Iraq war in 2002, but now a war critic. (Nov 2006)");
        war.add("Voted NO on designating Iran's Revolutionary Guards as terrorists. (Sep 2007)");
        war.add("Voted YES on redeploying US troops out of Iraq by March 2008. (Mar 2007)");
        war.add("Voted NO on redeploying troops out of Iraq by July 2007. (Jun 2006)");
        war.add("Voted YES on investigating contract awards in Iraq & Afghanistan. (Nov 2005)");
        war.add("Voted YES on $86 billion for military operations in Iraq & Afghanistan. (Oct 2003)");
        war.add("Voted YES on authorizing use of military force against Iraq. (Oct 2002)");
        war.add("Voted NO on allowing all necessary force in Kosovo. (May 1999)");
        war.add("Voted YES on authorizing air strikes in Kosovo. (Mar 1999)");
        war.add("Voted YES on ending the Bosnian arms embargo. (Jul 1995)");
        war.add("Condemns anti-Muslim bigotry in name of anti-terrorism. (Oct 2001)");
        war.add("No troop surge: no military escalation in Iraq. (Jan 2007)");
        war.add("Deploy UN multinational peacekeeping force in Darfur. (Jul 2007)");
        war.add("Move the US Embassy to Jerusalem. (Nov 1995)");



        List<String> welfare = new ArrayList<>();
        welfare.add("Americans don't want handouts, just to be given a chance. (Sep 2014)");
        welfare.add("It's not 'culture of dependency'; it's acquiring skills. (Sep 2012)");
        welfare.add("No faith-based initiative; it ain’t broke, so don’t fix it. (Oct 2007)");
        welfare.add("We’re no longer certain our kids will be better off than us. (Feb 2007)");
        welfare.add("Voted YES on welfare block grants. (Aug 1996)");
        welfare.add("Voted YES on eliminating block grants for food stamps. (Jul 1996)");
        welfare.add("Voted NO on allowing state welfare waivers. (Jul 1996)");
        welfare.add("Voted YES on welfare overhaul. (Sep 1995)");
        welfare.add("Fully fund AmeriCorps. (Jun 2003)");
        welfare.add("Develop a strategy to eliminate extreme global poverty. (Dec 2007)");









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
