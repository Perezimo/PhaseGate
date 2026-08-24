 import java.util.Arrays;
import java.util.Scanner;
public class MbtiTest{
	public static void main(String[] args){
	String [][] questions = {
	{"A. expend energy, enjoy groups", "B. conserve energy, enjoy one-on-one"},
	{"A. Interpret literally", "B, look meaning and possibilities"},
	{"A. logical, thinking, questioning", "B. empathetic, feeling, accommodating"},
	{"A. organized, orderly", "B. flexible, adaptable"},
	{"A. more outgoing, think out loud", "B.more reserved, think to yourself"},
	{"A. practical, realistic, experiental", "B. imaginative, innovative, theoritical"},
	{"A. candid, straight forward, frank", "B. tactful, kind, encouraging"},
	{"A. plan, schedule", "B. unplanned, spontaneous"},
	{"A. seek many tasks, public activities, interaction with others", "B. seek private, solitary activities with quiet to concentrate"},
	{"A. standard, usual, conventional", "B. different, novel, unique"},
	{"A. firm, tend to criticize, hold the line", "B. gentle, tend to appreciate, conciliate"},
	{"A.regulated, structured", "B. easy-going, live and let live"},
	{"A. external, communicative, express yourself", "B. internal, reticent, keep to yourself"},
	{"A.focus on here-and-now", "B. look to the future, global perspective, big picture"},
	{"A. Tough minded, just", "B. Tender hearted, merciful"},
	{"A. preparation, plan ahead", "B. go with the flow, adapt as you go"},
	{"A. active, initiate", "B. reflecttive, delibrate"},
	{"A. facts, things, what is", "B. ideas, dreams, what could be, philisophical"},
	{"A. matter of fact, issue-oriented", "B. sensitive, people-oriented, compassionate"},
	{"A. control, govern", "B. latitude, freedom"}
	
	
	
		};
		
	String [] answerArray = new String[20];
	Scanner scanner = new Scanner(System.in);
	System.out.println("What is your name?");
	String name = scanner.nextLine();
	int count = 0;
	
	while(count<20){
		System.out.println(questions[count][0] + "\t" + questions[count][1]);
		char answer = scanner.next().charAt(0);
		if(Character.toUpperCase(answer) == 'A'){
		answerArray[count] = questions[count][0];
		}else if (Character.toUpperCase(answer) == 'B') answerArray[count] = questions[count][1];
		else {
		System.out.println("Invalid input!");
		count--;
		}
		count++;
	}
	System.out.println("Hello " + name + " You selected");
	String personality = "";
	for(int innerCount=0; innerCount<4;innerCount++){
	int noOfA = 0;
	int noOfB = 0;
		for(int counter=innerCount; counter<20; counter+=4){
			System.out.println(answerArray[counter]);
			if(answerArray[counter].charAt(0) == 'A') noOfA++;
			else noOfB++;
		}
		System.out.println("Number of A selected:" + noOfA);
		System.out.println("Number of B selected:" + noOfB);
		if(innerCount == 0){
			if(noOfA < noOfB){
			personality += "I";
			}else{
			personality += "E";
			}
		}else if(innerCount == 1){
			if(noOfA < noOfB){
			personality += "S";
			}else{
			personality += "N";
			}
		}else if(innerCount == 2){
			if(noOfA < noOfB){
			personality += "T";
			}else{
			personality += "F";
			}
		}else if(innerCount == 3){
			if(noOfA < noOfB){
			personality += "J";
			}else{
			personality += "P";
			}
		}
		System.out.println("");
	}
	System.out.println(personality);
	switch(personality){
	case "INFP":
		    System.out.println("  Healer");
               System.out.println("  The Thoughtful Idealist (MBTI)");
                System.out.println("  The Mediator (16Personalities)\n");
                
                System.out.println("The INFP Personality Type");
                System.out.println("INFPs are imaginative idealists, guided by their own core values and beliefs.");
                System.out.println("To a Healer, possibilities are paramount; the realism of the moment is only");
                System.out.println("of passing concern. They see potential for a better future, and pursue truth");
                System.out.println("and meaning with their own individual flair.\n");
                
                System.out.println("INFPs are sensitive, caring, and compassionate, and are deeply concerned with");
                System.out.println("the personal growth of themselves and others. Individualistic and");
                System.out.println("nonjudgmental, INFPs believe that each person must find their own path. They");
                System.out.println("enjoy spending time exploring their own ideas and values, and are gently");
                System.out.println("encouraging to others to do the same. INFPs are creative and often artistic;");
                System.out.println("they enjoy finding new outlets for self-expression.\n");
                
                System.out.println("What does INFP stand for?");
                System.out.println("INFP is one of the sixteen personality types created by Katharine Briggs and");
                System.out.println("Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI®). INFP");
                System.out.println("stands for Introversion, iNtuition, Feeling, and Perceiving, which are four");
                System.out.println("core personality traits based on the work of psychologist C.G. Jung.");
                System.out.println("Each of the four letters of the INFP code signifies a key personality trait of");
                System.out.println("this type. INFPs are energized by time alone (Introverted), focus on ideas");
                System.out.println("and concepts rather than facts and details (iNtuitive), make decisions based");
                System.out.println("on feelings and values (Feeling), and prefer to be spontaneous and flexible");
                System.out.println("rather than planned and organized (Perceiving).");
                break;
                
    	case "INTJ":
    			System.out.println("  Architect");
               		System.out.println("  The Thoughtful Idealist (MBTI)");
                		System.out.println("  The Mediator (16Personalities)\n");
                		
                	System.out.println("The INTJ Personality Type");	
            		System.out.println("INTJs are independent and analytical thinkers.");
		            System.out.println("who value logic, knowledge, and self-improvement.");
		            System.out.println("They do well in careers that reward problem-solving, innovation, and long-term planning");
		            System.out.println("They’re loyal and thoughtful partners, but may struggle to express their emotions.\n");
		            
		            System.out.println("INTJ personalities are characterized by their reserved, logical, and analytical nature.");
		            System.out.println("Known as the Architect, these individuals excel in independent thinking ");
		            System.out.println("and are driven by curiosity and self-improvement");
		            System.out.println("They appreciate logic over emotion, making them adept at strategic planning and problem-solving");
		            System.out.println("Understanding INTJ traits can provide insights into their unique approach to life and relationships");
		            System.out.println("they enjoy finding new outlets for self-expression.\n");
		            
		            System.out.println("What does INTJ stand for?");
		            System.out.println("INTJ is one of the sixteen personality types created by Katharine Briggs and");
		            System.out.println("Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI®). INFP");
		            System.out.println("INTJ stands for Introverted, Intuitive, Thinking, and Judging., which are four");
		            System.out.println("core personality traits based on the work of psychologist C.G. Jung.");
		            System.out.println("Each of the four letters of the INTJ code signifies a key personality trait of");
		            System.out.println("this type. INTJs tend to value creative ingenuity, straightforward rationality, and self-improvement");
		            System.out.println("They consistently work toward enhancing intellectual abilities and");
		            System.out.println("are often driven by an intense desire to master any and every topic that piques their interest");
		            System.out.println("Logical and quick-witted, INTJs pride themselves on their ability to think for themselves.");
		            break;
		            
    	case "INTP":
    			System.out.println("  Logician");
               		System.out.println("  The Thoughtful Idealist (MBTI)");
                		System.out.println("  The Mediator (16Personalities)\n");
                		
                	System.out.println("The INTP Personality Type");	
            		System.out.println("IPeople with the INTP personality type (Logicians) pride themselves on their unique perspective and vigorous intellect.");
		            System.out.println("They can’t help but puzzle over the mysteries of the universe.");
		            System.out.println("– which may explain why some of the most influential philosophers and scientists of all time have been INTPs");
		            System.out.println("People with this personality type tend to prefer solitude, as they can easily become immersed in their thoughts\n");
		            
		            System.out.println("From the outside, INTPs may seem to live in a never-ending daydream..");
		            System.out.println("They have a reputation for being pensive, detached, and a bit reserved. ");
		            System.out.println("INTPs are Introverts and tend to get tired out by extensive socializing. ");
		            System.out.println("After a long day, they crave time alone to consult their own thoughts.");
		            System.out.println("INTPs cherish their independence and often find themselves most productive .");
		            System.out.println("during the late evening hours when distractions are kept to a minimum\n");
		            
		            System.out.println("What does INTP stand for?");
		            System.out.println("INTP is one of the sixteen personality types created by Katharine Briggs and");
		            System.out.println("Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI®). INFP");
		            System.out.println("INTJ stands for Introverted, Intuitive, Thinking, and Judging., which are four");
		            System.out.println("core personality traits based on the work of psychologist C.G. Jung.");
		            System.out.println("Each of the four letters of the INTP code signifies a key personality trait of");
		            System.out.println("INTPs rarely mean to be dishonest, but with their active mind, ");
		            System.out.println("they sometimes overflow with ideas and theories that they haven’t thought through all the way");
		            System.out.println("Fortunately, when it comes to dissecting a tricky, multilayered problem and coming up with ");
		            System.out.println(" creative solution, few personality types can match INTPs’ creative genius and potential.");
		            break;
		case "ENTJ":
				System.out.println("  Commander");
               		System.out.println("  The Thoughtful Idealist (MBTI)");
                		System.out.println("  The Mediator (16Personalities)\n");
                		
                	System.out.println("The ENTJ Personality Type");	
            		System.out.println("People with the ENTJ personality type (Commanders) are natural-born leaders.");
		            System.out.println("Embodying the gifts of charisma and confidence, ENTJs project authority");
		            System.out.println(" in a way that draws crowds together behind a common goal. However, these personalities are also characterized");
		            System.out.println("by an often ruthless level of rationality, using their drive, determination, and sharp mind,\n");
		            
		            System.out.println("Their intensity might sometimes rub people the wrong way, but ultimately, ");
		            System.out.println("ENTJs take pride in both their work ethic and their impressive level of self-discipline");
		            System.out.println("If there’s anything that people with this personality type love, it’s a good challenge,  ");
		            System.out.println("big or small, and they firmly believe that, given enough time and resources, they can achieve any goal.");
		            System.out.println("This quality makes ENTJs brilliant entrepreneurs, and their ability to think strategically and hold a long-term .");
		            System.out.println("focus while executing each step of their plans with determination and precision makes them powerful business leaders. \n");
		            
		            System.out.println("What does ENTJ stand for?");
		            System.out.println("ENTJ is one of the sixteen personality types created by Katharine Briggs and");
		            System.out.println("Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI®). INFP");
		            System.out.println("ENTJ stands for Extraverted, Intuitive, Thinking, and Judging, which are four");
		            System.out.println("core personality traits based on the work of psychologist C.G. Jung.");
		            System.out.println("Each of the four letters of the ENTJ code signifies a key personality trait of");
		            System.out.println("ENTJs respect those who can match them intellectually and also display precision and . ");
		            System.out.println("quality in their actions, equal to their own. These personalities have a particular skill ");
		            System.out.println("Fortunately, when it comes to dissecting a tricky, multilayered problem and coming up with ");
		            System.out.println("in recognizing the talents of others, and this helps in their team-building efforts.");
		            break;

		case "ENTP":
				System.out.println("  Debater");
               		System.out.println("  The Thoughtful Idealist (MBTI)");
                		System.out.println("  The Mediator (16Personalities)\n");
                		
                	System.out.println("The ENTP Personality Type");	
            		System.out.println("Quick-witted and audacious, people with the ENTP personality type (Debaters) aren’t afraid to disagree with the status quo.");
		            System.out.println("In fact, they’re not afraid to disagree with pretty much anything or anyone");
		            System.out.println("Few things light up these personalities more than a bit of verbal sparring –");
		            System.out.println(" and if the conversation veers into controversial terrain, so much the better.\n");
		            
		            System.out.println("ENTP personalities are the ultimate devil’s advocates, thriving on the process of shredding people’s arguments to pieces");
		            System.out.println("Sometimes they even rebel against their own beliefs by arguing the opposing viewpoint.");
		            System.out.println("ENTPs are known for their rebellious streak. For this personality type, no belief is too sacred to be questioned,");
		            System.out.println("no idea is too fundamental to be scrutinized, and no rule is too important to be broken or at least thoroughly tested .");
		            System.out.println("ENTP personalities seem overly cavalier or defiant, but at their core, their innate tendency to test boundaries.");
		            System.out.println("has more to do with their desire for innovation and change. \n");
		            
		            System.out.println("What does ENTPstand for?");
		            System.out.println("ENTP is one of the sixteen personality types created by Katharine Briggs and");
		            System.out.println("Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI®). INFP");
		            System.out.println("ENTP stands for Extraverted, Intuitive, Thinking, and Perceiving, which are four");
		            System.out.println("core personality traits based on the work of psychologist C.G. Jung.");
		            System.out.println("Each of the four letters of the ENTP code signifies a key personality trait of");
		            System.out.println("Often called The Debater or The Innovator, this type loves big ideas, mental challenges, and questioning the status quo. ");
		            System.out.println("While ENTPs love to brainstorm and think big, these personalities tend to avoid getting");
		            System.out.println("To some extent, this makes sense – they have far too many thoughts and suggestions to keep track of them all, .");
		            System.out.println("let alone turn them into reality.");
		            break;
		case "INFJ":
				System.out.println("  Advocate");
               		System.out.println("  The Thoughtful Idealist (MBTI)");
                		System.out.println("  The Mediator (16Personalities)\n");
                		
                	System.out.println("The INFJ Personality Type");	
            		System.out.println("Idealistic and principled, people with the INFJ personality type (Advocates) aren’t content to coast through life – ");
		            System.out.println("they want to stand up and make a difference.For these compassionate personalities, success doesn’t come from money or status");
		            System.out.println("While they have lofty goals and ambitions, INFJs shouldn’t be mistaken for idle dreamers.");
		            System.out.println("People with this personality type care about integrity, and they’re rarely satisfied until they’ve done.\n");
		            
		            System.out.println("INFJ personalities might come across as somewhat reserved, but they are fueled by a profound internal passion.");
		            System.out.println("Fortunately, this sense of being out of step doesn’t diminish INFJs’ commitment to making the world a better place.");
		            System.out.println("These personalities are troubled by injustice, and they typically care more about altruism than personal gain,");
		            System.out.println("They often feel called to use their strengths – including creativity, imagination, and sensitivity –.");
		            System.out.println("Nothing lights up an INFJ personality like changing someone else’s life for the better.");
		            System.out.println("Few things bring these personalities as much joy as truly knowing another person – and being known in return. \n");
		            
		            System.out.println("What does INFJ stand for?");
		            System.out.println("INFJ is one of the sixteen personality types created by Katharine Briggs and");
		            System.out.println("Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI®). INFP");
		            System.out.println("INFJ stands for Introverted, Intuitive, Feeling, and Judging, which are four");
		            System.out.println("core personality traits based on the work of psychologist C.G. Jung.");
		            System.out.println("Each of the four letters of the INFJ code signifies a key personality trait of");
		            System.out.println("Often called The Debater, this type loves big ideas, mental challenges, and questioning the status quo.");
		            System.out.println("INFJs may focus so intently on their ideals that they don’t take adequate care of themselve.");
		            System.out.println("To some extent, this makes sense – they have far too many thoughts and suggestions to keep track of them all, .");
		            System.out.println("let alone turn them into reality.");
		            break;

    				
		default:
	System.out.println("default");
	}
	}
	
}
