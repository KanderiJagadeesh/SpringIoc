/*
 * package com.test.security;
 * 
 * import java.util.HashSet; import java.util.Set; import
 * java.util.stream.Collectors;
 * 
 * import org.springframework.security.core.authority.SimpleGrantedAuthority;
 * import com.google.common.collect.Sets; public enum ApplicationUserRole {
 * 
 * STUDENT(Sets.newHashSet()),
 * ADMIN(Sets.newHashSet(ApplicationUserPermission.COURSE_READ,
 * ApplicationUserPermission.COURSE_WRITE,
 * ApplicationUserPermission.STUDENT_READ,ApplicationUserPermission.
 * STUDENT_WRITE)),
 * ADMINTRAINEE(Sets.newHashSet(ApplicationUserPermission.COURSE_READ,
 * ApplicationUserPermission.STUDENT_READ)), Sets;
 * 
 * 
 * private final HashSet<ApplicationUserPermission> permission;
 * 
 * ApplicationUserRole(HashSet<ApplicationUserPermission> permission) {
 * this.permission=permission; } public Set<SimpleGrantedAuthority>
 * getSimpleGrantedAuthority() { Set<SimpleGrantedAuthority> permissions=
 * getPermission().stream() .map(permission -> new
 * SimpleGrantedAuthority(permission.getPermission()))
 * .collect(Collectors.toSet()); permissions.add(new
 * SimpleGrantedAuthority("ROLE_"+this.name())); return permissions; } public
 * Set<ApplicationUserPermission> getPermission() { return permission; }
 * 
 * }
 */