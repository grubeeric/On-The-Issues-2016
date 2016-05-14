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

public class BernieSanders extends AppCompatActivity {
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
        setContentView(R.layout.activity_bernie_sanders);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvBern);

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
        abortion.add("Lifetime pro-choice record, plus funding for family planning. (Sep 2015)");
        abortion.add("Advocate for family planning and funding for contraceptives. (Sep 2015)");
        abortion.add("Women have the right to choose, regardless of income. (Jun 1997)");
        abortion.add("Voted NO on restricting UN funding for population control policies. (Mar 2009)");
        abortion.add("Voted NO on defining unborn child as eligible for SCHIP. (Mar 2008)");
        abortion.add("Voted NO on prohibiting minors crossing state lines for abortion. (Mar 2008)");
        abortion.add("Voted NO on barring HHS grants to organizations that perform abortions. (Oct 2007)");
        abortion.add("Voted YES on expanding research to more embryonic stem cell lines. (Apr 2007)");
        abortion.add("Voted YES on allowing human embryonic stem cell research. (May 2005)");
        abortion.add("Voted NO on restricting interstate transport of minors to get abortions. (Apr 2005)");
        abortion.add("Voted NO on making it a crime to harm a fetus during another crime. (Feb 2004)");
        abortion.add("Voted NO on banning partial-birth abortion except to save mother’s life. (Oct 2003)");
        abortion.add("Voted YES on forbidding human cloning for reproduction & medical research. (Feb 2003)");
        abortion.add("Voted NO on funding for health providers who don't provide abortion info. (Sep 2002)");
        abortion.add("Voted NO on banning Family Planning funding in US aid abroad. (May 2001)");
        abortion.add("Voted NO on banning partial-birth abortions. (Apr 2000)");
        abortion.add("Voted NO on barring transporting minors to get an abortion. (Jun 1999)");
        abortion.add("Rated 100% by NARAL, indicating a pro-choice voting record. (Dec 2003)");
        abortion.add("Emergency contraception for rape victims at all hospitals. (Sep 2006)");
        abortion.add("Rated 0% by the NRLC, indicating a pro-choice stance. (Dec 2006)");
        abortion.add("Provide emergency contraception at military facilities. (Apr 2007)");
        abortion.add("Require pharmacies to fulfill contraceptive prescriptions. (Jul 2011)");
        abortion.add("Ban anti-abortion limitations on abortion services. (Nov 2013)");
        abortion.add("Protect the reproductive rights of women. (Jan 1993)");
        abortion.add("Ensure access to and funding for contraception. (Feb 2007)");
        abortion.add("Focus on preventing pregnancy, plus emergency contraception. (Jan 2009)");



        List<String> economy = new ArrayList<>();
        economy.add("Almost all new wealth goes to the top 1%. (Oct 2015)");
        economy.add("Economic justice: Address root causes of economic inequality. (Sep 2015)");
        economy.add("Break up large banks; add fees for high-risk investments. (Apr 2015)");
        economy.add("We've transferred trillions from middle class to the top 1%. (Apr 2015)");
        economy.add("Comprehensive 12-step agenda for moving America forward. (Jan 2015)");
        economy.add("Voted YES on $192B additional anti-recession stimulus spending. (Jul 2009)");
        economy.add("Voted YES on modifying bankruptcy rules to avoid mortgage foreclosures. (May 2009)");
        economy.add("Voted YES on additional $825 billion for economic recovery package. (Feb 2009)");
        economy.add("Voted YES on $60B stimulus package for jobs, infrastructure, & energy. (Sep 2008)");
        economy.add("Voted NO on paying down federal debt by rating programs' effectiveness. (Mar 2007)");
        economy.add("Voted NO on restricting bankruptcy rules. (Jan 2004)");
        economy.add("More enforcement of mortgage fraud and TARP fraud. (May 2009)");
        economy.add("Ban abusive credit practices & enhance consumer disclosure. (Feb 2009)");



        List<String> civilRights = new ArrayList<>();
        civilRights.add("Vermont implemented ENDA 22 years ago; so should feds. (Sep 2015)");
        civilRights.add("Black Lives Matter: deal with institutional racism. (Jul 2015)");
        civilRights.add("Right to love each other, regardless of sexual orientation. (Jul 2015)");
        civilRights.add("Equal pay for equal work by women. (Mar 2015)");
        civilRights.add("Bush’s tracking citizens’ phone call patterns is illegal. (Jun 2006)");
        civilRights.add("1964: civil rights activist in Congress on Racial Equality. (Jun 1997)");
        civilRights.add("Never accept racism, sexism, nor homophobia. (Jun 1997)");
        civilRights.add("Voted YES on reauthorizing the Violence Against Women Act. (Feb 2013)");
        civilRights.add("Voted NO on Constitutionally defining marriage as one-man-one-woman. (Jul 2006)");
        civilRights.add("Voted NO on making the PATRIOT Act permanent. (Dec 2005)");
        civilRights.add("Voted NO on Constitutional Amendment banning same-sex marriage. (Sep 2004)");
        civilRights.add("Voted NO on protecting the Pledge of Allegiance. (Sep 2004)");
        civilRights.add("Voted NO on constitutional amendment prohibiting flag desecration. (Jun 2003)");
        civilRights.add("Voted NO on banning gay adoptions in DC. (Jul 1999)");
        civilRights.add("Voted NO on ending preferential treatment by race in college admissions. (May 1998)");
        civilRights.add("Constitutional Amendment for equal rights by gender. (Mar 2001)");
        civilRights.add("Rated 93% by the ACLU, indicating a pro-civil rights voting record. (Dec 2002)");
        civilRights.add("Rated 100% by the HRC, indicating a pro-gay-rights stance. (Dec 2006)");
        civilRights.add("Rated 97% by the NAACP, indicating a pro-affirmative-action stance. (Dec 2006)");
        civilRights.add("Recognize Juneteenth as historical end of slavery. (Jun 2008)");
        civilRights.add("ENDA: prohibit employment discrimination for gays. (Jun 2009)");
        civilRights.add("Prohibit sexual-identity discrimination at schools. (Mar 2011)");
        civilRights.add("Endorsed as 'preferred' by The Feminist Majority indicating pro-women's rights. (Aug 2012)");
        civilRights.add("Enforce against wage discrimination based on gender. (Jan 2013)");
        civilRights.add("Enforce against anti-gay discrimination in public schools. (Jun 2013)");
        civilRights.add("Re-introduce the Equal Rights Amendment. (Mar 2007)");



        List<String> corporations = new ArrayList<>();
        corporations.add("Fix estate tax so mega-rich pay their fair share. (Sep 2015)");
        corporations.add("Wall Street business model is a fraud & led us to recession. (Aug 2015)");
        corporations.add("Casino-type capitalism causes devastating problems. (Jul 2015)");
        corporations.add("Break up major Wall Street firms. (Mar 2015)");
        corporations.add("Worker-owned cooperatives instead of corporate tax breaks. (Mar 2015)");
        corporations.add("Bank bailout was socialism for the rich. (Feb 2015)");
        corporations.add("Break up the Wall Street giants; they can't be reformed. (Jan 2015)");
        corporations.add("Americans want change: corporations get rich & people don't. (Sep 2014)");
        corporations.add("Cap deductions for CEO pay; count perks as profit. (Jun 1997)");
        corporations.add("In 1980s, wealthiest 1% got 2/3 of all wealth increases. (Jun 1997)");
        corporations.add("Stop $31M Pentagon payments for corporate mergers. (Jun 1997)");
        corporations.add("The needs of the rich & large corporations are never ignored. (Jun 1997)");
        corporations.add("Voted NO on replacing illegal export tax breaks with $140B in new breaks. (Jun 2004)");
        corporations.add("Voted NO on Bankruptcy Overhaul requiring partial debt repayment. (Mar 2001)");
        corporations.add("Require Code of Conduct for US corporations abroad. (Aug 2001)");
        corporations.add("Rated 14% by the US COC, indicating an anti-business voting record. (Dec 2003)");
        corporations.add("Expand lending caps for credit unions to small business. (Mar 2012)");
        corporations.add("Rated 86% by UFCW, indicating an anti-management/pro-labor record. (May 2012)");
        corporations.add("Corporate political spending is not free speech. (Mar 2013)");



        List<String> crime = new ArrayList<>();
        crime.add("Blacks are disproportionately imprisoned & killed by police. (Sep 2015)");
        crime.add("Reinstate voting rights to address school-to-prison pipeline. (Sep 2015)");
        crime.add("Voted YES on reinstating $1.15 billion funding for the COPS Program. (Mar 2007)");
        crime.add("Voted YES on funding for alternative sentencing instead of more prisons. (Jun 2000)");
        crime.add("Voted NO on more prosecution and sentencing for juvenile crime. (Jun 1999)");
        crime.add("Voted YES on maintaining right of habeas corpus in Death Penalty Appeals. (Mar 1996)");
        crime.add("Voted NO on making federal death penalty appeals harder. (Feb 1995)");
        crime.add("Voted YES on replacing death penalty with life imprisonment. (Apr 1994)");
        crime.add("Rated 78% by CURE, indicating pro-rehabilitation crime votes. (Dec 2000)");
        crime.add("More funding and stricter sentencing for hate crimes. (Apr 2001)");
        crime.add("Require DNA testing for all federal executions. (Mar 2001)");
        crime.add("Increase funding for 'COPS ON THE BEAT' program. (Jan 2007)");
        crime.add("Reduce recidivism by giving offenders a Second Chance. (Mar 2007)");



        List<String> drugs = new ArrayList<>();
        drugs.add("War on drugs is a failed policy; treatment over punishment. (Sep 2015)");
        drugs.add("Decriminalize marijuana and study recreational legalization. (Sep 2015)");
        drugs.add("Voted NO on military border patrols to battle drugs & terrorism. (Sep 2001)");
        drugs.add("Voted NO on subjecting federal employees to random drug tests. (Sep 1998)");
        drugs.add("Legalize medical marijuana. (Jul 2001)");
        drugs.add("Exclude industrial hemp from definition of marijuana. (Aug 2012)");
        drugs.add("Exempt industrial hemp from marijuana laws. (Mar 2013)");



        List<String> education = new ArrayList<>();
        education.add("Replace NCLB standardized testing with holistic approach. (Sep 2015)");
        education.add("Ok to include mandates and incentives in Common Core. (Sep 2015)");
        education.add("Vouchers redirect public education dollar to private schools. (Sep 2015)");
        education.add("Charter schools ok if held to public school standards. (Sep 2015)");
        education.add("Taught low-income preschoolers through Head Start program. (Sep 2015)");
        education.add("$18B to fund two years free tuition at state colleges. (Apr 2015)");
        education.add("College loan repayment is regressive; refinance & forgive. (Apr 2015)");
        education.add("Quality affordable education, from child care to higher ed. (Mar 2015)");
        education.add("Make college affordable for everyone. (Jan 2015)");
        education.add("1976: produced educational filmstrips on New England history. (Jun 1997)");
        education.add("Voted YES on additional $10.2B for federal education & HHS projects. (Oct 2007)");
        education.add("Voted YES on allowing Courts to decide on 'God' in Pledge of Allegiance. (Jul 2006)");
        education.add("Voted YES on $84 million in grants for Black and Hispanic colleges. (Mar 2006)");
        education.add("Voted NO on allowing school prayer during the War on Terror. (Nov 2001)");
        education.add("Voted YES on requiring states to test students. (May 2001)");
        education.add("Voted NO on allowing vouchers in DC schools. (Aug 1998)");
        education.add("Voted NO on vouchers for private & parochial schools. (Nov 1997)");
        education.add("Voted NO on giving federal aid only to schools allowing voluntary prayer. (Mar 1994)");
        education.add("Reduce class size to 18 children in grades 1 to 3. (Mar 2001)");
        education.add("Rated 83% by the NEA, indicating pro-public education votes. (Dec 2003)");
        education.add("$25B to renovate or repair elementary schools. (Sep 2011)");
        education.add("Sponsored extending subsidized federal student loan rates until 2015. (Apr 2013)");
        education.add("Make employee educational assistance tax-deductible. (Jan 1993)");
        education.add("Don't count combat pay against free school lunch. (Mar 2009)");



        List<String> energy = new ArrayList<>();
        energy.add("Address climate change so we can leave planet to our kids. (Oct 2015)");
        energy.add("Combat climate skeptics with overwhelming evidence. (Sep 2015)");
        energy.add("Keystone pipeline transports the dirtiest fossil fuel. (Sep 2015)");
        energy.add("Charge companies for carbon emissions; then fund renewables. (Apr 2015)");
        energy.add("Transform to sustainable system & away from fossil fuels. (Mar 2015)");
        energy.add("Weatherize millions of homes and buildings. (Jan 2015)");
        energy.add("Gas tax increases are regressive. (Jun 1997)");
        energy.add("Voted NO on barring EPA from regulating greenhouse gases. (Apr 2011)");
        energy.add("Voted NO on protecting middle-income taxpayers from a national energy tax. (Apr 2009)");
        energy.add("Voted NO on requiring full Senate debate and vote on cap-and-trade. (Apr 2009)");
        energy.add("Voted YES on tax incentives for energy production and conservation. (Jun 2008)");
        energy.add("Voted YES on addressing CO2 emissions without considering India & China. (May 2008)");
        energy.add("Voted YES on removing oil & gas exploration subsidies. (Jun 2007)");
        energy.add("Voted YES on making oil-producing and exporting cartels illegal. (Jun 2007)");
        energy.add("Voted YES on factoring global warming into federal project planning. (May 2007)");
        energy.add("Voted YES on keeping moratorium on drilling for oil offshore. (Jun 2006)");
        energy.add("Voted NO on scheduling permitting for new oil refinieries. (Jun 2006)");
        energy.add("Voted NO on authorizing construction of new oil refineries. (Oct 2005)");
        energy.add("Voted NO on passage of the Bush Administration national energy policy. (Jun 2004)");
        energy.add("Voted NO on implementing Bush-Cheney national energy policy. (Nov 2003)");
        energy.add("Voted YES on raising CAFE standards; incentives for alternative fuels. (Aug 2001)");
        energy.add("Voted YES on prohibiting oil drilling & development in ANWR. (Aug 2001)");
        energy.add("Voted YES on starting implementation of Kyoto Protocol. (Jun 2000)");
        energy.add("Regulate wholesale electricity & gas prices. (Mar 2001)");
        energy.add("Preserve Alaska's ANWR instead of drilling it. (Feb 2001)");
        energy.add("Establish greenhouse gas tradeable allowances. (Feb 2005)");
        energy.add("Rated 100% by the CAF, indicating support for energy independence. (Dec 2006)");
        energy.add("Sign on to UN Framework Convention on Climate Change. (Jan 2007)");
        energy.add("Designate sensitive ANWR area as protected wilderness. (Nov 2007)");
        energy.add("Set goal of 25% renewable energy by 2025. (Jan 2007)");
        energy.add("Let states define stricter-than-federal emission standards. (Jan 2008)");



        List<String> enviornment = new ArrayList<>();
        enviornment.add("Advocate of animal welfare and humane treatment. (Sep 2015)");
        enviornment.add("Protect important watersheds and wildlife areas. (Sep 2015)");
        enviornment.add("GMOs are ok, but only with required labeling. (Sep 2015)");
        enviornment.add("Cut subsidies of wealthy farmers; increase grazing fees. (Jun 1997)");
        enviornment.add("City residents often frozen out of development decisions. (Jun 1997)");
        enviornment.add("Voted YES on protecting ocean, coastal, and Great Lakes ecosystems. (May 2013)");
        enviornment.add("Voted YES on $2 billion more for Cash for Clunkers program. (Aug 2009)");
        enviornment.add("Voted NO on prohibiting eminent domain for use as parks or grazing land. (Dec 2007)");
        enviornment.add("Voted YES on increasing AMTRAK funding by adding $214M to $900M. (Jun 2006)");
        enviornment.add("Voted YES on barring website promoting Yucca Mountain nuclear waste dump. (May 2006)");
        enviornment.add("Voted NO on deauthorizing 'critical habitat' for endangered species. (Sep 2005)");
        enviornment.add("Voted NO on speeding up approval of forest thinning projects. (Nov 2003)");
        enviornment.add("Prohibits commercial logging on Federal public lands. (Apr 2001)");
        enviornment.add("Rated 90% by the LCV, indicating pro-environment votes. (Dec 2003)");
        enviornment.add("Promote conservation of rare felids & canids. (Mar 2007)");
        enviornment.add("Make tax deduction permanent for conservation easements. (Mar 2009)");
        enviornment.add("Regulate all dog breeders down to kennels of 50 dogs. (Feb 2011)");
        enviornment.add("Prohibit invasive research on great apes. (Apr 2011)");
        enviornment.add("Prohibits breeding or possessing Big Cat species. (Sep 2012)");
        enviornment.add("Rated 100% by HSLF, indicating a pro-animal welfare voting record. (Jan 2012)");
        enviornment.add("Require labeling genetically engineered food. (Apr 2013)");
        enviornment.add("Strengthen prohibitions against animal fighting. (Jan 2007)");



        List<String> foreignPolicy = new ArrayList<>();
        foreignPolicy.add("Putin regrets invading Crimea & the Ukraine. (Oct 2015)");
        foreignPolicy.add("Address humanitarian crisis in Syria with allies in region. (Sep 2015)");
        foreignPolicy.add("Normalize relations with Cuba; & respect their independence. (Sep 2015)");
        foreignPolicy.add("Two-state solution for Israel & Palestine. (Sep 2015)");
        foreignPolicy.add("Begrudgingly supports NATO, but no eastward expansion. (Sep 2015)");
        foreignPolicy.add("Promote democracy in China, but not at expense of US workers. (Sep 2015)");
        foreignPolicy.add("We have to negotiate with others, even Iran. (Aug 2015)");
        foreignPolicy.add("Focus on domestic needs instead of international conflict. (Apr 2015)");
        foreignPolicy.add("War is a local issue because local youngsters fight and die. (Jun 1997)");
        foreignPolicy.add("Voted NO on cooperating with India as a nuclear power. (Oct 2008)");
        foreignPolicy.add("Voted YES on deterring foreign arms transfers to China. (Jul 2005)");
        foreignPolicy.add("Voted NO on reforming the UN by restricting US funding. (Jun 2005)");
        foreignPolicy.add("Voted YES on keeping Cuba travel ban until political prisoners released. (Jul 2001)");
        foreignPolicy.add("Voted NO on withholding $244M in UN Back Payments until US seat restored. (May 2001)");
        foreignPolicy.add("Voted YES on $156M to IMF for 3rd-world debt reduction. (Jul 2000)");
        foreignPolicy.add("Voted NO on Permanent Normal Trade Relations with China. (May 2000)");
        foreignPolicy.add("Voted YES on $15.2 billion for foreign operations. (Nov 1999)");
        foreignPolicy.add("Allow Americans to travel to Cuba. (May 2000)");
        foreignPolicy.add("Member of the Congressional Human Rights Caucus. (Jan 2001)");
        foreignPolicy.add("Multi-year commitment to Africa for food & medicine. (Apr 2001)");
        foreignPolicy.add("Urge China to respect religious freedom. (Mar 2001)");
        foreignPolicy.add("Impose sanctions and an import ban on Burma. (Oct 2007)");
        foreignPolicy.add("Remove African National Congress from terrorist list. (May 2008)");
        foreignPolicy.add("Implement Darfur Peace Agreement with UN peacekeeping force. (Feb 2008)");
        foreignPolicy.add("Seeds of Peace: promote coexistence in regions of conflict. (Apr 2008)");
        foreignPolicy.add("Rated +2 by AAI, indicating pro-Arab pro-Palestine voting record. (May 2012)");
        foreignPolicy.add("Condemn violence by Chinese government in Tibet. (Apr 2008)");
        foreignPolicy.add("Allow travel between the United States and Cuba. (Feb 2009)");



        List<String> trade = new ArrayList<>();
        trade.add("China trade has led to loss of 3M American jobs so far. (Sep 2015)");
        trade.add("Priority of trade deals should be helping American workers. (Sep 2015)");
        trade.add("Base trade policy on working families, not multinationals. (Jun 2015)");
        trade.add("Wrong, wrong, wrong that trade deals create jobs here. (Apr 2015)");
        trade.add("End disastrous NAFTA, CAFTA, and PNTR with China. (Mar 2015)");
        trade.add("Stop TPP, the Trans-Pacific Partnership. (Jan 2015)");
        trade.add("US trade policies represent interests of corporate America. (Jun 1997)");
        trade.add("Agreed with Ross Perot's critique of trade policy. (Jun 1997)");
        trade.add("NAFTA was a sellout to corporate America. (Jun 1997)");
        trade.add("NAFTA, GATT, and MFN for China must be repealed. (Jun 1997)");
        trade.add("Voted NO on promoting free trade with Peru. (Dec 2007)");
        trade.add("Voted NO on implementing CAFTA, Central America Free Trade. (Jul 2005)");
        trade.add("Voted NO on implementing US-Australia Free Trade Agreement. (Jul 2004)");
        trade.add("Voted NO on implementing US-Singapore free trade agreement. (Jul 2003)");
        trade.add("Voted NO on implementing free trade agreement with Chile. (Jul 2003)");
        trade.add("Voted YES on withdrawing from the WTO. (Jun 2000)");
        trade.add("Voted NO on 'Fast Track' authority for trade agreements. (Sep 1998)");
        trade.add("Rated 33% by CATO, indicating a mixed record on trade issues. (Dec 2002)");
        trade.add("Extend trade restrictions on Burma to promote democracy. (Jun 2007)");
        trade.add("Review free trade agreements biennially for rights violation. (Jun 2009)");
        trade.add("Impose tariffs against countries which manipulate currency. (Feb 2011)");
        trade.add("No MFN for China; condition trade on human rights. (Nov 1999)");



        List<String> guns = new ArrayList<>();
        guns.add("I want to shield gun shops from lawsuits, not manufacturers. (Oct 2015)");
        guns.add("Deal federally with straw-man gun purchasers. (Oct 2015)");
        guns.add("Ban semiautomatic guns & gun show loophole. (Aug 2015)");
        guns.add("Instant background checks: no guns for criminals or unstable. (Jul 2015)");
        guns.add("Guns in Vermont are for hunting; but in L.A. are for killing. (Jul 2015)");
        guns.add("Mixed approach to gun control vs. gun rights. (Apr 2015)");
        guns.add("I'm pro-hunting, but no one needs an AK-47 to hunt. (Jun 1997)");
        guns.add("Voted YES on banning high-capacity magazines of over 10 bullets. (Apr 2013)");
        guns.add("Voted YES on allowing firearms in checked baggage on Amtrak trains. (Apr 2009)");
        guns.add("Voted YES on prohibiting foreign & UN aid that restricts US gun ownership. (Sep 2007)");
        guns.add("Voted YES on prohibiting product misuse lawsuits on gun manufacturers. (Oct 2005)");
        guns.add("Voted YES on prohibiting suing gunmakers & sellers for gun misuse. (Apr 2003)");
        guns.add("Voted NO on decreasing gun waiting period from 3 days to 1. (Jun 1999)");
        guns.add("Rated F by the NRA, indicating a pro-gun control voting record. (Dec 2003)");



        List<String> healthCare = new ArrayList<>();
        healthCare.add("Mental health coverage would stop suicides AND homicides. (Oct 2015)");
        healthCare.add("Medicare for all: healthcare is a human right. (Sep 2015)");
        healthCare.add("Vaccinations work; electing not to vaccinate is dangerous. (Sep 2015)");
        healthCare.add("Voted for ObamaCare; but prefers single-payer system. (Apr 2015)");
        healthCare.add("U.S. is only major country without guaranteed healthcare. (Apr 2015)");
        healthCare.add("Move toward a single-payer system. (Mar 2015)");
        healthCare.add("1972: Pushed for dental care for low-income children. (Jun 1997)");
        healthCare.add("Civilized societies provide healthcare for the poor. (Jun 1997)");
        healthCare.add("Voted NO on the Ryan Budget: Medicare choice, tax & spending cuts. (May 2011)");
        healthCare.add("Voted YES on regulating tobacco as a drug. (Jun 2009)");
        healthCare.add("Voted YES on expanding the Children's Health Insurance Program. (Jan 2009)");
        healthCare.add("Voted YES on overriding veto on expansion of Medicare. (Jul 2008)");
        healthCare.add("Voted NO on means-testing to determine Medicare Part D premium. (Mar 2008)");
        healthCare.add("Voted NO on allowing tribal Indians to opt out of federal healthcare. (Feb 2008)");
        healthCare.add("Voted YES on adding 2 to 4 million children to SCHIP eligibility. (Nov 2007)");
        healthCare.add("Voted YES on requiring negotiated Rx prices for Medicare part D. (Apr 2007)");
        healthCare.add("Voted NO on denying non-emergency treatment for lack of Medicare co-pay. (Feb 2006)");
        healthCare.add("Voted NO on limiting medical malpractice lawsuits to $250,000 damages. (May 2004)");
        healthCare.add("Voted NO on limited prescription drug benefit for Medicare recipients. (Nov 2003)");
        healthCare.add("Voted YES on allowing reimportation of prescription drugs. (Jul 2003)");
        healthCare.add("Voted NO on small business associations for buying health insurance. (Jun 2003)");
        healthCare.add("Voted NO on capping damages & setting time limits in medical lawsuits. (Mar 2003)");
        healthCare.add("Voted NO on allowing suing HMOs, but under federal rules & limited award. (Aug 2001)");
        healthCare.add("Voted NO on subsidizing private insurance for Medicare Rx drug coverage. (Jun 2000)");
        healthCare.add("Voted NO on banning physician-assisted suicide. (Oct 1999)");
        healthCare.add("Voted NO on establishing tax-exempt Medical Savings Accounts. (Oct 1999)");
        healthCare.add("MEDS Plan: Cover senior Rx under Medicare. (Jan 2001)");
        healthCare.add("Rated 100% by APHA, indicating a pro-public health record. (Dec 2003)");
        healthCare.add("Improve services for people with autism & their families. (Apr 2007)");
        healthCare.add("Establish a national childhood cancer database. (Mar 2007)");
        healthCare.add("Increase funding for occupational & physical therapy. (Apr 2011)");
        healthCare.add("Preserve access to Medicaid & SCHIP during economic downturn. (Apr 2008)");
        healthCare.add("Provide for treatment of autism under TRICARE. (Jun 2009)");
        healthCare.add("Sponsored bill expanding the National Health Service Corps. (Mar 2009)");
        healthCare.add("Collect data on birth defects and present to the public. (Apr 1998)");
        healthCare.add("Make health care a right, not a privilege. (Nov 1999)");



        List<String> immigration = new ArrayList<>();
        immigration.add("Comprehensive reform with no border fence & no guest workers. (Sep 2015)");
        immigration.add("Secure borders without building a fence. (Sep 2015)");
        immigration.add("Offer path to citizenship; waive deportation for DREAMers. (Apr 2015)");
        immigration.add("English-Only, based in xenophobia, hurts legal immigrants. (Jun 1997)");
        immigration.add("Voted YES on continuing federal funds for declared 'sanctuary cities'. (Mar 2008)");
        immigration.add("Voted NO on comprehensive immigration reform. (Jun 2007)");
        immigration.add("Voted NO on declaring English as the official language of the US government. (Jun 2007)");
        immigration.add("Voted YES on eliminating the 'Y' nonimmigrant guestworker program. (May 2007)");
        immigration.add("Voted NO on building a fence along the Mexican border. (Sep 2006)");
        immigration.add("Voted YES on preventing tipping off Mexicans about Minuteman Project. (Jun 2006)");
        immigration.add("Voted NO on reporting illegal aliens who receive hospital treatment. (May 2004)");
        immigration.add("Voted NO on more immigrant visas for skilled workers. (Sep 1998)");
        immigration.add("Rated 0% by FAIR, indicating a voting record loosening immigration. (Dec 2003)");
        immigration.add("Rated 8% by USBC, indicating an open-border stance. (Dec 2006)");



        List<String> jobs = new ArrayList<>();
        jobs.add("Obama rebuilt jobs; but middle class is disappearing. (Oct 2015)");
        jobs.add("Raise the minimum wage to $15 per hour. (Mar 2015)");
        jobs.add("Corporate opposition makes union organizing difficult. (Mar 2015)");
        jobs.add("Create worker-owned cooperatives & grow unions. (Jan 2015)");
        jobs.add("Voted YES on extending unemployment benefits from 39 weeks to 59 weeks. (Nov 2008)");
        jobs.add("Voted YES on overriding presidential veto of Farm Bill. (Jun 2008)");
        jobs.add("Voted NO on terminating legal challenges to English-only job rules. (Mar 2008)");
        jobs.add("Voted YES on limiting farm subsidies to people earning under $750,000. (Dec 2007)");
        jobs.add("Voted YES on restricting employer interference in union organizing. (Jun 2007)");
        jobs.add("Voted YES on increasing minimum wage to $7.25. (Feb 2007)");
        jobs.add("Voted NO on end offshore tax havens and promote small business. (Oct 2004)");
        jobs.add("Voted NO on $167B over 10 years for farm price supports. (Oct 2001)");
        jobs.add("Voted NO on zero-funding OSHA's Ergonomics Rules instead of $4.5B. (Mar 2001)");
        jobs.add("Member of the Congressional Rural Caucus. (Jan 2001)");
        jobs.add("Require full disclosure of outsourced employees. (Feb 2001)");
        jobs.add("Rated 100% by the AFL-CIO, indicating a pro-union voting record. (Dec 2003)");
        jobs.add("Allow an Air Traffic Controller's Union. (Jan 2006)");
        jobs.add("Form unions by card-check instead of secret ballot. (Mar 2009)");
        jobs.add("Raise the minimum wage to $10.10 per hour by 2016. (Jan 2014)");
        jobs.add("Extend unemployment compensation during recession. (Jan 2008)");
        jobs.add("Ban discriminatory compensation; allow 2 years to sue. (Jan 2009)");
        jobs.add("Stronger enforcement against gender-based pay discrimination. (Jan 2009)");



        List<String> socialSecurity = new ArrayList<>();
        socialSecurity.add("Defend against chained CPI, and expand Social Security. (Oct 2015)");
        socialSecurity.add("No cuts; no privatization; even to deal with deficit. (Sep 2015)");
        socialSecurity.add("Raise the Social Security cap on taxable income. (Aug 2015)");
        socialSecurity.add("Strengthen the social safety net, instead of weakening it. (Mar 2015)");
        socialSecurity.add("We must strengthen the social safety net, not weaken it. (Jan 2015)");
        socialSecurity.add("Despite GOP rhetoric, Social Security is NOT going bankrupt. (Sep 2006)");
        socialSecurity.add("It's regressive to increase taxable Social Security income. (Jun 1997)");
        socialSecurity.add("Voted NO on establishing reserve funds & pre-funding for Social Security. (Mar 2007)");
        socialSecurity.add("Voted NO on raising 401(k) limits & making pension plans more portable. (May 2001)");
        socialSecurity.add("Voted NO on reducing tax payments on Social Security benefits. (Jul 2000)");
        socialSecurity.add("Voted YES on strengthening the Social Security Lockbox. (May 1999)");
        socialSecurity.add("Changing Social Security disproportionately affects women. (May 2001)");
        socialSecurity.add("Reject proposals for private saving accounts. (May 2002)");
        socialSecurity.add("Rated 100% by the ARA, indicating a pro-senior voting record. (Dec 2003)");
        socialSecurity.add("Reject privatization; don't raise the retirement age. (Aug 2010)");
        socialSecurity.add("Sponsored keeping CPI for benefits instead of lower 'Chained CPI'. (Apr 2013)");
        socialSecurity.add("Rated 100% by ARA, indicating a pro-Trust Fund stance. (Jan 2013)");



        List<String> tax = new ArrayList<>();
        tax.add("Raise top marginal income tax rate from 39% to over 50%. (Sep 2015)");
        tax.add("Lower cutoff for estate tax from $5.4M to $3.5M. (Sep 2015)");
        tax.add("Double the capital gains tax for the wealthiest 2%. (Apr 2015)");
        tax.add("We need a progressive tax system based on ability to pay. (Mar 2015)");
        tax.add("Real tax reform based on ability to pay. (Jan 2015)");
        tax.add("Capital gains & dividend tax cuts are giveaways to the rich. (Jun 2006)");
        tax.add("Cap the home mortgage interest deduction at $300,000. (Jun 1997)");
        tax.add("Property taxes are highly regressive & hurt poor & seniors. (Jun 1997)");
        tax.add("1% room-and-meal tax instead of property tax. (Jun 1997)");
        tax.add("Voted YES on increasing tax rate for people earning over $1 million. (Mar 2008)");
        tax.add("Voted NO on allowing AMT reduction without budget offset. (Mar 2008)");
        tax.add("Voted NO on raising the Death Tax exemption to $5M from $1M. (Feb 2008)");
        tax.add("Voted NO on repealing the Alternative Minimum Tax. (Mar 2007)");
        tax.add("Voted NO on raising estate tax exemption to $5 million. (Mar 2007)");
        tax.add("Voted NO on retaining reduced taxes on capital gains & dividends. (Dec 2005)");
        tax.add("Voted YES on providing tax relief and simplification. (Sep 2004)");
        tax.add("Voted NO on making permanent an increase in the child tax credit. (May 2004)");
        tax.add("Voted YES on permanently eliminating the marriage penalty. (Apr 2004)");
        tax.add("Voted NO on making the Bush tax cuts permanent. (Apr 2002)");
        tax.add("Voted NO on $99 B economic stimulus: capital gains & income tax cuts. (Oct 2001)");
        tax.add("Voted NO on Tax cut package of $958 B over 10 years. (May 2001)");
        tax.add("Voted NO on eliminating the Estate Tax ('death tax'). (Apr 2001)");
        tax.add("Voted NO on eliminating the 'marriage penalty'. (Jul 2000)");
        tax.add("Voted NO on $46 billion in tax cuts for small business. (Mar 2000)");
        tax.add("American People's Dividend: Give $300 to every person. (Feb 2001)");
        tax.add("Rated 28% by NTU, indicating a 'Big Spender' on tax votes. (Dec 2003)");
        tax.add("Rated 100% by the CTJ, indicating support of progressive taxation. (Dec 2006)");
        tax.add("Minimum tax rate of 30% for those earning over $1 million. (Mar 2012)");



        List<String> technology = new ArrayList<>();
        technology.add("Net Neutrality: no preferential treatment for corporations. (Sep 2015)");
        technology.add("I support funding NASA, but our planet has to come first. (Sep 2015)");
        technology.add("Stop bailing out Wall Street & start repairing Main Street. (Mar 2015)");
        technology.add("$1 trillion investment in infrastructure. (Jan 2015)");
        technology.add("Sued cable TV company to pay city for damaging streets. (Jun 1997)");
        technology.add("Voted YES on authorizing states to collect Internet sales taxes. (May 2013)");
        technology.add("Voted YES on $23B instead of $4.9B for waterway infrastructure. (Nov 2007)");
        technology.add("Voted YES on establishing 'network neutrality' (non-tiered Internet). (Jun 2006)");
        technology.add("Voted NO on increasing fines for indecent broadcasting. (Feb 2005)");
        technology.add("Voted NO on promoting commercial human space flight industry. (Nov 2004)");
        technology.add("Voted YES on banning Internet gambling by credit card. (Jun 2003)");
        technology.add("Voted NO on allowing telephone monopolies to offer Internet access. (Feb 2002)");
        technology.add("Promote internet via Congressional Internet Caucus. (Jan 2001)");
        technology.add("Facilitate nationwide 2-1-1 phone line for human services. (Jan 2007)");
        technology.add("Ensure net neutrality: no corporate-tiered Internet. (Jan 2007)");
        technology.add("Overturn FCC approval of media consolidation. (Mar 2008)");



        List<String> war = new ArrayList<>();
        war.add("Syria is a quagmire within a quagmire; don't get involved. (Oct 2015)");
        war.add("Voted for Afghan War, to capture Osama bin Laden. (Sep 2015)");
        war.add("Stop ISIS, but only with an international & Arab coalition. (Sep 2015)");
        war.add("Iraq war destabilized Mideast; stay out of Mideast quagmire. (Sep 2015)");
        war.add("Iran nuke deal is victory for diplomacy over saber-rattling. (Sep 2015)");
        war.add("Get Saudis & regional powers involved with fighting ISIS. (Oct 2014)");
        war.add("Arm the Peshmerga against ISIS, as international effort. (Oct 2014)");
        war.add("1983 war against Nicaragua was illegal and immoral. (Jun 1997)");
        war.add("1990: Opposed authorizing all-out war in Kuwait with Iraq. (Jun 1997)");
        war.add("1991: instead of Persian Gulf War, spend on America. (Jun 1997)");
        war.add("Voted YES on redeploying non-essential US troops out of Iraq in 9 months. (Dec 2007)");
        war.add("Voted NO on designating Iran's Revolutionary Guards as terrorists. (Sep 2007)");
        war.add("Voted YES on redeploying US troops out of Iraq by March 2008. (Mar 2007)");
        war.add("Voted NO on declaring Iraq part of War on Terror with no exit date. (Jun 2006)");
        war.add("Voted NO on approving removal of Saddam & valiant service of US troops. (Mar 2004)");
        war.add("Voted NO on authorizing military force in Iraq. (Oct 2002)");
        war.add("Voted YES on disallowing the invasion of Kosovo. (May 1999)");
        war.add("Condemns anti-Muslim bigotry in name of anti-terrorism. (Oct 2001)");
        war.add("Require Congress' approval before military action in Iran. (Oct 2007)");



        List<String> welfare = new ArrayList<>();
        welfare.add("Economic inequality & institutional racism exist in parallel. (Sep 2015)");
        welfare.add("Advocate for social benefits of public assistance programs. (Sep 2015)");
        welfare.add("3.5 million Americans homeless is unacceptable. (Sep 2015)");
        welfare.add("Economic insecurity is pivotal in how one lives one's life. (Jun 1997)");
        welfare.add("Land Trust: affordable housing by resale below market rates. (Jun 1997)");
        welfare.add("Opposed cutting food stamps. (Jun 1997)");
        welfare.add("U.S. has highest income inequality in industrialized world. (Jun 1997)");
        welfare.add("Voted YES on instituting National Service as a new social invention. (Mar 2009)");
        welfare.add("Voted YES on providing $70 million for Section 8 Housing vouchers. (Jun 2006)");
        welfare.add("Voted NO on promoting work and marriage among TANF recipients. (Feb 2003)");
        welfare.add("Voted NO on treating religious organizations equally for tax breaks. (Jul 2001)");
        welfare.add("Voted NO on responsible fatherhood via faith-based organizations. (Nov 1999)");
        welfare.add("Increase the earned income tax credit. (Jan 1993)");
        welfare.add("Fully fund Head Start; Job Corps; and WIC food program. (Apr 1993)");
        welfare.add("Support school breakfast for low-income children. (Mar 2009)");
        welfare.add("Reduce the concentration of wealth & wage inequality. (Nov 1999)");





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
