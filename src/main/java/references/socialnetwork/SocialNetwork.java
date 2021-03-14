package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {

    List<Member> memberList = new ArrayList<>();

    public void addMember(String name) {
       memberList.add(new Member(name));
    }

    public void connect(String name, String otherName){
        Member foundMember = findByName(name);
        foundMember.connectMember(findByName(otherName));
    }

    public Member findByName(String name){
        for(Member member : memberList){
            if(member.getName().equals(name)){
                return member;
            }
        }
        return null;
    }

    public List<String> bidirectionalConnections(){
        List<String>connectedMembersList = new ArrayList<>();
        for(Member member : memberList) {
            for(Member connectedMember : member.getConnections()){
                if(connectedMember.getConnections().contains(member)){
                    connectedMembersList.add(member.getName() + "-" + connectedMember.getName());
                }
            }
        }
        return connectedMembersList;
    }

    @Override
    public String toString() {
        return memberList.toString();
    }
}
