package uk.ac.reigate.domain.academic;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QStudentInterimReport is a Querydsl query type for StudentInterimReport
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QStudentInterimReport extends EntityPathBase<StudentInterimReport> {

    private static final long serialVersionUID = 370492215L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QStudentInterimReport studentInterimReport = new QStudentInterimReport("studentInterimReport");

    public final NumberPath<Integer> absence = createNumber("absence", Integer.class);

    public final NumberPath<Integer> authorisedAbsence = createNumber("authorisedAbsence", Integer.class);

    public final NumberPath<Integer> classEthic = createNumber("classEthic", Integer.class);

    public final QCourse course;

    public final uk.ac.reigate.domain.lookup.QPossibleGrade currentPredictedGrade;

    public final QInterimReport interimReport;

    public final uk.ac.reigate.domain.lookup.QPossibleGrade keyAssessment1;

    public final uk.ac.reigate.domain.lookup.QPossibleGrade keyAssessment2;

    public final NumberPath<Integer> late = createNumber("late", Integer.class);

    public final SimplePath<groovy.lang.MetaClass> metaClass = createSimple("metaClass", groovy.lang.MetaClass.class);

    public final NumberPath<Integer> motivation = createNumber("motivation", Integer.class);

    public final uk.ac.reigate.domain.QStaff staff;

    public final QStudent student;

    public final NumberPath<Integer> timeManagement = createNumber("timeManagement", Integer.class);

    public final NumberPath<Integer> totalPossible = createNumber("totalPossible", Integer.class);

    public QStudentInterimReport(String variable) {
        this(StudentInterimReport.class, forVariable(variable), INITS);
    }

    public QStudentInterimReport(Path<? extends StudentInterimReport> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QStudentInterimReport(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QStudentInterimReport(PathMetadata metadata, PathInits inits) {
        this(StudentInterimReport.class, metadata, inits);
    }

    public QStudentInterimReport(Class<? extends StudentInterimReport> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.course = inits.isInitialized("course") ? new QCourse(forProperty("course"), inits.get("course")) : null;
        this.currentPredictedGrade = inits.isInitialized("currentPredictedGrade") ? new uk.ac.reigate.domain.lookup.QPossibleGrade(forProperty("currentPredictedGrade"), inits.get("currentPredictedGrade")) : null;
        this.interimReport = inits.isInitialized("interimReport") ? new QInterimReport(forProperty("interimReport"), inits.get("interimReport")) : null;
        this.keyAssessment1 = inits.isInitialized("keyAssessment1") ? new uk.ac.reigate.domain.lookup.QPossibleGrade(forProperty("keyAssessment1"), inits.get("keyAssessment1")) : null;
        this.keyAssessment2 = inits.isInitialized("keyAssessment2") ? new uk.ac.reigate.domain.lookup.QPossibleGrade(forProperty("keyAssessment2"), inits.get("keyAssessment2")) : null;
        this.staff = inits.isInitialized("staff") ? new uk.ac.reigate.domain.QStaff(forProperty("staff"), inits.get("staff")) : null;
        this.student = inits.isInitialized("student") ? new QStudent(forProperty("student"), inits.get("student")) : null;
    }

}

