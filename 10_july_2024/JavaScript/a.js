function assignGrade(score) {

    if (score < 0 || score > 100) {

    } else if (score >= 90) {

        return "Grade A";


    } else if (score >= 80) {
        return "Grade B";

    } else if (score >= 70) {
        return "Grade C";

    } else if (score >= 60) {
        return "Grade D";

    } else if (score >= 80) {
        return "Grade E";
    } else {
        return "Grade F";

    }
}
console.log(assignGrade(95));
console.log(assignGrade(85));
console.log(assignGrade(75));
console.log(assignGrade(65));
console.log(assignGrade(55));
console.log(assignGrade(45));




//Switch Statement

function getUserAccess(role, resource) {
    switch (role) {
        case "admin":
            return "Full Access";

        case "editor":
            switch (resource) {
                case 'article':
                    return "access the edit article";
                case 'video':
                    return "access video edit";
                default:
                    return "limited access";
            }
        case 'viewer':
            return "only view access";
        default:
            return "no access granted";
    }

}
console.log(getUserAccess('admin', 'article'));
console.log(getUserAccess('editor', 'article'));
console.log(getUserAccess('editor', 'video'));
console.log(getUserAccess('admin', 'podcast'));
console.log(getUserAccess('viewer', 'article'));
