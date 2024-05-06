//package Practice;
//
//public class RecordShopList {
//
//        record[] rArr;
//
//        RecordList() {
//            this.rArr = new record[0];
//        }
//
//        // 맨 끝에 추가
//        void push(Member newMember) {
//            Member[] temp = new Member[rArr.length + 1];
//            for (int i = 0; i < rArr.length; i++) {
//                temp[i] = rArr[i];
//            }
//            temp[temp.length - 1] = newMember;
//            rArr = temp;
//        }
//        // 인덱스 찾기
//        int findIndex(String email) {
//            for (int i = 0; i < rArr.length; i++) {
//                if (email.equals(rArr[i].email)) {
//                    return i;
//                }
//            }
//            return -1;
//        }
//        // 한 명의 회원 정보 얻기
//        Member get(String email) {
//            int index = findIndex(email);
//            return get(index);
//        }
//        Member get(int index) {
//            return rArr[index];
//        }
//
//        // 맨 끝 제거
//        Member pop() {
//            // 맨 끝 회원 백업
//            Member lastMember = rArr[rArr.length - 1];
//            Member[] temp = new Member[rArr.length - 1];
//            for (int i = 0; i < temp.length; i++) {
//                temp[i] = rArr[i];
//            }
//            rArr = temp;
//            return lastMember;
//        }
//
//        // 회원 정보 삭제
//        Member remove(int index) {
//            // 삭제 대상 백업
//            Member removedMember = rArr[index];
//            for (int i = index; i < rArr.length - 1; i++) {
//                rArr[i] = rArr[i + 1];
//            }
//            pop();
//            return removedMember;
//        }
//        Member remove(Member deleteMember) {
//            int index = findIndex(deleteMember.email);
//            return remove(index);
//        }
//
//        // 배열에 저장된 요소 수 리턴
//        int size() {
//            return rArr.length;
//        }
//
//        // 배열 리턴
//        Member[] getMembers() {
//            return rArr;
//        }
//
//    }
//